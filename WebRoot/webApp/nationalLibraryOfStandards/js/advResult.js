
var advResult =  sessionStorage.getItem("datas");
var resultDetail = $.parseJSON(advResult);
var keyWord = sessionStorage.getItem("keyWord");
var international = sessionStorage.getItem("international");
var national = sessionStorage.getItem("national");
var standardSort = sessionStorage.getItem("standardSort");
var standardStatus = sessionStorage.getItem("standardStatus");
var totalPage = sessionStorage.getItem("totalPage");
var page = sessionStorage.getItem("page");
var totalRes = resultDetail;

window.onload = function(){
	console.log(resultDetail);
	if(keyWord != "" && keyWord != "undefined" && keyWord != "null"){
		$(".keyword input").val(keyWord);
	}
	if(resultDetail == ""){
		$("#empty").show();
	}else{
		update(resultDetail);
	}
	$('.main').dropload({
		scrollArea : window,
		loadDownFn : function(me) {
			
			// 为了测试，延迟1秒加载
			setTimeout(function() {
				page++;
				if(page <= 30 && page <= totalPage){
					upload();
					me.resetload();
				}else {
					$(".pull").fadeIn(1000);
					$(".pull").fadeOut(1000);
					me.resetload();
					return;
				}
			}, 1000);
		}
	});
};

$(document).on("click",".detail",function(){
	var now_id = $(this).attr("id");
	window.location.href = "/standard/webApp/details/details.html?id="+now_id+"";
});



function update(data){

	var result = "";
	for(var i = 0;i<data.length;i++){
		result += "	<div class='detail' id='"+data[i]["记录标识符"]+"'>"
					+"<div class='docNum'><span>"+data[i]["文献号"]+"</span><span class='type'>现行</span></div>"
					+"<div class='chineseName'>中文题名：<span>"+data[i]["中文题名"]+"</span></div>" ;
					if(data[i]["英文题名"] == ""){
						result += "<div class='englishName'>英文题名：<span>无</span></div>";
					}else{
						result += "<div class='englishName'>英文题名：<span>"+data[i]["英文题名"]+"</span></div>";
					}
						result += "</div>";
	}
	$(".main").append(result);
}

function upload(this_keyword){
	$("#empty").hide();
	if (standardSort == "undefined"){
		standardSort = "";
	} 
	if(international == "undefined"){
		international = "";
	}
	if(national == "undefined"){
		national = "";
	}
	if(standardStatus == "undefined"){
		standardStatus = "";
	}
	if(this_keyword != undefined){
		keyWord = this_keyword;
	}
	var parameterList = [keyWord,"",standardSort,international,national,"","","",standardStatus,"","",page,"10"];
	console.log(parameterList);
	console.log("para");
	$.ajax({
		type : "POST",
		url : "../../servlet/advancedSearch",
		data : {
			parameterList : parameterList,
			portName : "advencedSearch",
			returnType : "QueryResult"
		},
		traditional : true,
		async : false,
		success : function(data) {
			var this_data = $.parseJSON(data);
			console.log(this_data);
			console.log("-----");
			var detail = $.parseJSON(this_data[0].resultStr);
			for(var i = 0;i < detail.length;i++){
				totalRes.push(detail[i]);
			}
			sessionStorage.datas =  JSON.stringify(totalRes);
			sessionStorage.page = page;
			console.log("totalpage");
			console.log(this_data[0].totalPage);
			if(page > this_data[0].totalPage && this_data[0].totalPage != 0){
				$(".pull").fadeIn(1000);
				$(".pull").fadeOut(1000);
				return;
			}else if((page == 1 && detail.length == 0 )|| this_data[0].totalPage == 0){
				$("#empty").show();
			}
			update(detail);
		}
	});
}
//重搜
function search(){
	$(".main").empty();
	page = 1;
	totalRes = [];
	var this_keyword = $(".keyword").children("input").val();
	sessionStorage.keyWord = this_keyword;
	upload(this_keyword);
	$("body").scrollTop("120px");
}
//筛选
function filtrate(){
	console.log(keyWord);
	keyWord = escape(keyWord);
	window.location.href = "/standard/webApp/nationalLibraryOfStandards/advancedQuery.html?keyword="+keyWord;
}
// 返回
function back(){
//	sessionStorage.removeItem("nat");
//	sessionStorage.removeItem("inter");
//	sessionStorage.removeItem("variety");
//	window.location.href = "/standard/webApp/nationalLibraryOfStandards/advancedQuery.html";
	window.history.go(-1);
}


	