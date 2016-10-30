
window.onload = function(){
	$(".part2").val("");
	var sendingKeyWord = sessionStorage.getItem("keyWord");
	var standardStatus = sessionStorage.getItem("standardStatus");
	if(sendingKeyWord != "" && sendingKeyWord != "undefined" && sendingKeyWord != "null"){
		$("#keyword").val(sendingKeyWord);
	}
	if(standardStatus != "" && standardStatus != "undefined" && standardStatus != "null"){
		$("#state span").text(standardStatus);
	}
	//选择具体标准状态
	$(document).on('click', '.states li', function(){
    	var result = $(this).text();
    	var state = $(this).attr("class");
    	if(state == undefined){
    		state = "";
    	}
    	$("#state").attr("state",state);
    	$("#stateImg").attr("value","0");
    	$("#stateImg").attr("class","stateImg2");
    	$(".states").hide(500);
    	$(".content").text(result);
	});
	initial();
	judgeLastPage();
};

function initial(){
	var variety = sessionStorage.getItem("variety")?sessionStorage.getItem("variety").split(",") : sessionStorage.getItem("variety");
	var international = sessionStorage.getItem("inter")?sessionStorage.getItem("inter").split(","):sessionStorage.getItem("inter");
	var national = sessionStorage.getItem("nat")?sessionStorage.getItem("nat").split(","):sessionStorage.getItem("nat");
	
	console.log(variety);
	console.log(international);
	console.log(national);
	if(variety != undefined){
		if(variety.length > 2){
			$("#varieties").val(variety[0]+","+variety[1]+"等"+variety.length+"项");
		}else{
			$("#varieties").val(variety);
		}
	}
	if(international != undefined){
		if(international.length > 2){
			$("#international").val(international[0]+","+international[1]+"等"+international.length+"项");
		}else{
			$("#international").val(international);
		}
	}
	if(national != undefined){
		if(national.length > 2){
			$("#national").val(national[0]+","+national[1]+"等"+national.length+"项");
		}else {
			$("#national").val(national);
		}
		
	}
}

//判断是否有上一页
function judgeLastPage(){
	if(document.referrer == ""){
		$(".back2").hide();
		$("header strong").css("margin-left","0");
	}else{
		$(".back2").show();
		$("header strong").css("margin-left","-30px");
	}
}

//选择标准状态
function choseState(_this){
	if($(_this).find("#stateImg").attr("value") == "0"){
		$("#stateImg").attr("class","stateImg1");
		$(".states").show(500);
		$(_this).find("#stateImg").attr("value","1");
	}else{
		$(".states").hide(500);
		$("#stateImg").attr("class","stateImg2");
		$(_this).find("#stateImg").attr("value","0");
	}
}

// 选择具体条件（国际，国内品种）
function chose(type){
	var keyword = $("#keyword").val();
	var types = $("#state span").text();
	if(keyword != undefined){
		sessionStorage.keyWord = keyword;
	}
	if(types != undefined){
		sessionStorage.standardStatus = types;
	}
	window.location.href = "/standard/webApp/nationalLibraryOfStandards/condition.html?type="+type;
}
//确认查询
function getSearchResult(){

	var keyWord = $(".part1").val();
	var standardStatus = $("#state").val();
	var international = $("#international").val();
	var national = $("#national").val();
	var standardSort = $("#varieties").val();
	console.log(international);
	console.log(national);
	console.log(standardSort);
	
	
	var parameterList = [keyWord,"",standardSort,international,national,"","","",standardStatus,"","","1","10"];
	var portName = "advencedSearch";
	var returnType = "QueryResult";
	console.log("keyWord" + keyWord +"standardStatus"+standardStatus+"international" +international+"national"+national+"standardSort"+standardSort);
	if(keyWord == "" && standardStatus == undefined && international == undefined && national == undefined && standardSort == undefined){
		alert("请填写查询条件");
		return;
	}
	$("#loading").show();
	$.ajax({
		type : "POST",
		url : "../../servlet/advancedSearch",
		data : {
			parameterList : parameterList,
			portName : portName,
			returnType : returnType
		},
		traditional : true,
		async : true,
		success : function(data) {
			
			var aa = $.parseJSON(data);
			console.log(aa);
			console.log("++++++");
			var detail = $.parseJSON(aa[0].resultStr);
			var details = aa[0].resultStr;
			console.log(aa);
			console.log(detail);
			console.log(details);
			if(window.sessionStorage){
				sessionStorage.datas =  details;
				sessionStorage.keyWord = keyWord;
				sessionStorage.standardStatus = standardStatus;
				sessionStorage.international = international;
				sessionStorage.national = national;
				sessionStorage.standardSort = standardSort;
				sessionStorage.totalPage = aa[0].totalPage;
				sessionStorage.page = "1";
				window.location.href = "/standard/webApp/nationalLibraryOfStandards/advResult.html";
			}else{
				 alert('This browser does NOT support localStorage');
			}
		}
	});
}

