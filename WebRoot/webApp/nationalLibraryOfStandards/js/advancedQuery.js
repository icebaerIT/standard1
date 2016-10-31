
//var sendingKeyWord =  $.getUrlParam("keyword");
var sendingKeyWord = sessionStorage.getItem("keyWord");
window.onload = function(){
	$(".part2").val("");
	judgeLastPage();
	if(sendingKeyWord != "" && sendingKeyWord != "undefined" && sendingKeyWord != "null"){
		console.log("sendingKeyWord");
		console.log(sendingKeyWord);
		$("#keyword").val(sendingKeyWord);
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
	showWhole();
	choseVariety();
	fillNational();
	fillInter();
};
	function chose(type){
		$("header img,header button").show();
		$("#main").hide();
		
		if(type == "1"){//国际标准
			$("header strong").text("国际标准分类");
			$(".sure").attr("sort","1");
			$("#choseInternational").show();
		}else if(type == "2"){//国内标准
			$("header strong").text("国内标准分类");
			$(".sure").attr("sort","2");
			$("#choseNational").show();
		}else if(type == "3"){//标准品种
			$("header strong").text("标准品种分类");
			$(".sure").attr("sort","3");
			$("#choseVar").show();
		}
		$(".back2").hide();
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

	//选择标准品种
//	function choseVarieties(){

//		var parameterList = [];
//		var returnType = "StandardSort";
//		var portName = "getStandardSortList";
//		
//		$.ajax({
//			type : "POST",
//			url : "../../servlet/GetPortServlet",
//			data : {
//				parameterList : parameterList,
//				portName : portName,
//				returnType : returnType
//			},
//			traditional : true,
//			async : false,
//			success : function(data) {
//				var aa = $.parseJSON(data);
//				$("#main").hide();
//				console.log(aa);
//
//			}
//		});
//		$("header strong").text("标准品种分类");
//		$("header img,header button").show();
//		$("#main").hide();
//		$("#choseVar").show();
		
//	}
	
	//标准品种树
	function choseVariety(){//填充品种树
		var variety = "";
		var ulName = "";
		for(var i=0; i<domain.length;i++){
			if(domain[i].id == "ST_N_SBTS"){
				ulName = "ST_N_SBTS";
				showTree(firstVar,ulName);
			}else if(domain[i].id == "ST_N_DB"){
				ulName = "ST_N_DB";
				showTree(secondVar,ulName);
			}else if(domain[i].id == "ST_N_CSIC"){
				ulName = "ST_N_CSIC";
				showTree(thirdVar,ulName);
			}else if(domain[i].id == "ST_F_INTER"){
				ulName = "ST_F_INTER";
				showTree(forthVar,ulName);
			}else if(domain[i].id == "ST_F_NATIONAL"){
				ulName = "ST_F_NATIONAL";
				showTree(fifthVar,ulName);
			}else if(domain[i].id == "ST_F_INSTITUTE"){
				ulName = "ST_F_INSTITUTE";
				showTree(sixthVar,ulName);
			}else{
				console.log("没有这个标准品种~");
			}
		}
	}
	function showWhole(){//一级树
		var varieties = "";
		for(var i=0;i<domain.length;i++){
			varieties += "	<li id='"+domain[i].id+"'><div>"
					+"<img src='img/right.png' onclick='choseVar(this)' state='0'>"
					+"<input class='firstCheck'type='checkbox' onclick='firstCheck(this)' value='0'>"
					+"</div><input disabled='' class='firstVarieties'value='"+domain[i].description +"'>"
			+"<ul class='"+domain[i].id+"'></ul></li>";
		}
		$("#variety").html(varieties);
	}
	function showTree(list,ulName){//二级树
		var tree = "";
		for(var i = 0; i < list.length; i++){
			tree += "<li id='"+list[i].id+"'><div>" 
			+"<input class='secondCheck' type='checkbox'sort='3' name='"+ulName+"'onclick='secondChose(this)' value='0'/></div>" 
			+"<input disabled class='firstVariety' value='"/*+list[i].id+"&nbsp;&nbsp;"*/+list[i].description+"'>" 
			+"</li>";
		}
		
		$("."+ulName).html(tree);
	}  
	
	//展开标准品种树
	function choseVar(_this){
		var val = $(_this).attr("state");
		if(val == "0"){
			$(_this).attr("class","varImg1");
			$(_this).parent().parent().find("ul .varImg1").attr("class","varImg2");
			$(_this).attr("state","1");
			$(_this).parent().parent().find("ul .varImg2").attr("state","0");
			$(_this).parent().parent().find("ul").show();
			$(_this).parent().parent().find("ul li ul").hide();
		}else{
			$(_this).attr("class","varImg2");
			$(_this).attr("state","0");
			$(_this).parent().parent().find("ul").hide();
			$(_this).parent().parent().find("ul li ul").show();
		}
	}
	
	//选择具体标准品种
	function firstCheck(_this){//一级选择
		var val = $(_this).attr("value");
		var now_name = true?$(_this).parent().parent().attr("id"):$(_this).parent().parent().attr("class");
		if(val == "0"){//全选中
			$("input[name='"+now_name+"']:checkbox").prop("checked", true);
			$(_this).attr("value","1");
			$("input[name='"+now_name+"']:checkbox").attr("value","1");
		}else{//取消全选
			$("input[name='"+now_name+"']:checkbox").prop("checked", false);
			$(_this).attr("value","0");
			$("input[name='"+now_name+"']:checkbox").attr("value","0");
		}
	}
	function secondChose(_this){//二级选择
		var val = $(_this).attr("value");
		
		if(val == "0"){//单项选中
			$(_this).attr("value","1");
			$(_this).parent().parent().find(".thirdCheck").prop("checked",true);
			$(_this).parent().parent().find(".thirdCheck").attr("value","1");
			var list = $(_this).parent().parent().parent().parent().find(".secondCheck");
			judge(_this,list,"firstCheck",1);
		
		}else{//取消二级单选
			$(_this).attr("value","0");
			$(_this).parent().parent().parent().parent().find(".firstCheck").prop("checked", false);
			$(_this).parent().parent().find(".thirdCheck").prop("checked",false);
			$(_this).parent().parent().parent().parent().find(".firstCheck").attr("value","0");
			$(_this).parent().parent().find(".thirdCheck").attr("value","0");
		}
	}
	
	function thirdChose(_this){
		var val = $(_this).attr("value");
		if(val == "0"){//单项选中
			$(_this).attr("value","1");
			var list1 = $(_this).parent().parent().parent().parent().find(".thirdCheck");
			var list2 = $(_this).parent().parent().parent().parent().parent().parent().find(".secondCheck");
			judge(_this,list1,"secondCheck",1);
			judge(_this,list2,"firstCheck",2);
			
		}else{//取消三级单选
			$(_this).attr("value","0");
			$(_this).parent().parent().parent().parent().find(".secondCheck").prop("checked", false);
			$(_this).parent().parent().parent().parent().find(".secondCheck").attr("value","0");
			$(_this).parent().parent().parent().parent().parent().parent().find(".firstCheck").prop("checked", false);
			$(_this).parent().parent().parent().parent().parent().parent().find(".firstCheck").attr("value","0");
		}
		
	}
	//判断check
	function judge(_this,list,className,series){
		var num = 0;
		for(var i = 0;i<list.length;i++){
			if($(list[i]).is(':checked')){
				num++;
			}else{
				return;
			}
			if(num == list.length){
				if(series == 1){
					$(_this).parent().parent().parent().parent().find("."+className).prop("checked", true);
					$(_this).parent().parent().parent().parent().find("."+className).attr("value","1");
				}else{
					$(_this).parent().parent().parent().parent().parent().parent().find("."+className).prop("checked", true);
					$(_this).parent().parent().parent().parent().parent().parent().find("."+className).attr("value","1");
				}
			}
		}
	}
	
	//确定选择
	function getResult(list){
		var choosenList = []; 
		for(var i = 0,j=0; i<list.length;i++){
			if($(list[i]).is(':checked')){
				choosenList[j] = $(list[i]).parent().parent().attr("id");
//				choosenList[j] = $(list[i]).parent().parent().children("input").val();
				j++;
			}
		}
		return choosenList;
	}
	function judgeRes(className,result){
		$("#"+className).attr("result",result);
		console.log(result);
		if(result.length > 1){
			$("#"+className).val(result[0]+"等"+result.length+"项");
		}else{
			$("#"+className).val(result);
		}
	}
	
	function sure(_this){
		var list2 = $(".secondCheck");
		var list3 = $(".thirdCheck");
		var list = list2.add(list3);
		var type = $(_this).attr("sort");//1：国际分类，2：国内分类，3：标准品种分类
		
		if(type == "1"){
			var result = getResult(list);
			judgeRes("international",result);
		}else if(type == "2"){
			var result = getResult(list3);
			judgeRes("national",result);
		}else{
			var result = getResult(list2);
			judgeRes("varieties",result);
		}
		$("#choseNational>ul>li>ul,#choseVar>ul>li>ul,#choseInternational>ul>li>ul").hide();
		$(".varImg1").attr("class","varImg2");
		$(".varImg2").attr("state",0);
		$(".firstCheck,.secondCheck,.thirdCheck").prop("checked", false);
		$(".firstCheck,.secondCheck,.thirdCheck").attr("value", "0");
		$("header img,header button,#choseVar,#choseNational,#choseInternational").hide();
		$("#main").show();
		judgeLastPage();
	}
	//返回
	function back(){

		$("#choseNational>ul>li>ul,#choseVar>ul>li>ul,#choseInternational>ul>li>ul").hide();
		$(".varImg1").attr("class","varImg2");
		$(".varImg2").attr("state",0);
		$("header img,header button,#choseVar,#choseNational,#choseInternational").hide();
		$(".firstCheck,.secondCheck,.thirdCheck").prop("checked", false);
		$(".firstCheck,.secondCheck,.thirdCheck").attr("value", "0");
		$("header strong").text("高级查询");
		$("#main").show();
		judgeLastPage();

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

	
	
	//选择国内标准分类
//	function national(){
//		var parameterList = ["B"];
//		var returnType = "Ccs";
//		var portName = "getCcsList";
//		
//		$.ajax({
//			type : "POST",
//			url : "../../servlet/GetPortServlet",
//			data : {
//				parameterList : parameterList,
//				portName : portName,
//				returnType : returnType
//			},
//			traditional : true,
//			async : false,
//			success : function(data) {
//				var aa = $.parseJSON(data);
//				console.log(aa);
//			}
//		});
		

//		$("#main").hide();
//		$("#choseNational").show();
//	}
	//填充第一级国内标准树
	function fillNational(){
		var nationals = "";
		var nat=[];
		
		for(var i = 0;i<firstNational.length;i++){
				var second = {};
				second.name = firstNational[i].prt;
				second.detail = secondNational[i];
				nat.push(second);
		}
		for(var j = 0;j<nat.length;j++){
			for(var k= 0;k<nat[j].detail.length;k++){
				nat[j].detail[k].third = naThirdAll[j][k];
			}
		}
		console.log("nat");
		console.log(nat);
		
		for(var i = 0;i<nat.length;i++){
			var now_name = nat[i].name.substr(0,1);
			nationals += "	<li id='"+now_name+"'><div>"
		           +"<img src='img/right.png'class='right' onclick='choseVar(this)' state='0'>"
				   +"<input class='firstCheck'type='checkbox' onclick='firstCheck(this)'name='"+now_name+"' value='0'>"
			       +"</div><input disabled='' class='firstVarieties'value='"+nat[i].name+"'>"
				   +"<ul class='"+now_name+"'>" ;
				   for(var j=0;j<nat[i].detail.length;j++){
					   nationals +=   "	<li id='"+nat[i].detail[j].cn+"'><div>"
			           +"<img src='img/right.png'class='right' onclick='choseVar(this)' state='0'>"
					   +"<input class='secondCheck'type='checkbox'style='margin-left:5px;' onclick='secondChose(this)'name='"+now_name+"' value='0'>"
				       +"</div><input disabled='' class='firstVarieties'value='"+nat[i].detail[j].prt+"'>"
					   +"<ul class='"+nat[i].detail[j].cn+"'>" ;
					   for(var k = 0;k<nat[i].detail[j].third.length;k++){
						   nationals +=   "	<li id='"+nat[i].detail[j].third[k].cn+"'><div>"
						   +"<input class='thirdCheck'type='checkbox'style='margin-left:20px;'sort='2' onclick='thirdChose(this)'name='"+now_name+"' value='0'>"
					       +"</div><input disabled='' class='firstVarieties'value='"+nat[i].detail[j].third[k].prt+"'>";
					   }
					   nationals +="</ul></li>" ;
				   }
				nationals += "</ul></li>";
		}
		
		$("#nationals").html(nationals);
	}

//	function international(){
//		var parameterList = ["27.120"];
//		var returnType = "Ics";
//		var portName = "getIcsList";
//		
//		$.ajax({
//			type : "POST",
//			url : "../../servlet/GetPortServlet",
//			data : {
//				parameterList : parameterList,
//				portName : portName,
//				returnType : returnType
//			},
//			traditional : true,
//			async : false,
//			success : function(data) {
//				var aa = $.parseJSON(data);
//				console.log(aa);
//			}
//		});
//	}
	
	function fillInter(){
		var international = "";
		var interAll = [];
		var firInterLength = firInter.length;
		for(var i = 0;i< firInterLength;i++){
				var second = {};
				second.name = firInter[i].prt;
				second.details = secInter[i];
				interAll.push(second);
		}
		
		for(var i = 0;i < inThirdAll.length; i++){
			for(var j = 0;j<inThirdAll[i].length;j++){
				var m = 0;
				if(inThirdAll[i][j][m].icsn){
					var thirdIcsn = inThirdAll[i][j][m].icsn.substr(0 , 6);
					for(var k = 0 ;k < interAll[i].details.length;k++){
						if(interAll[i].details[k].icsn == thirdIcsn){
							interAll[i].details[k].third = inThirdAll[i][j];
						}
					}
				}
				m++;
			}
		}
		console.log(interAll);
		console.log("国际标准");
		for(var i = 0;i<interAll.length;i++){
			var now_name = interAll[i].name.substr(0,6);
			international += "	<li id='"+now_name+"'><div>"
		           +"<img src='img/right.png'class='right' onclick='choseVar(this)' state='0'>"
				   +"<input class='firstCheck'type='checkbox' onclick='firstCheck(this)'name='"+now_name+"' value='0'>"
			       +"</div><input disabled='' class='firstVarieties'value='"+interAll[i].name+"'>"
				   +"<ul class='"+now_name+"'>" ;
					for(var j=0;j<interAll[i].details.length;j++){
						international += "<li id='"+interAll[i].details[j].icsn+"'><div>";
						if(interAll[i].details[j].third){
							international += "<img src='img/right.png'class='right' onclick='choseVar(this)' state='0'>"
											+"<input class='secondCheck'type='checkbox'style='margin-left:0px;' onclick='secondChose(this)'name='"+now_name+"' value='0'>";
						}else{
							international +="<input class='secondCheck'type='checkbox'style='margin-left:25px;' onclick='secondChose(this)'name='"+now_name+"' value='0'>";
						}
						international += "</div><input disabled='' class='firstVarieties'value='"+interAll[i].details[j].prt+"'>"
						   +"<ul class='"+interAll[i].details[j].icsn+"'>" ;
						if(interAll[i].details[j].third){
							   for(var k = 0;k<interAll[i].details[j].third.length;k++){
								   international += "<li id='"+interAll[i].details[j].third[k].icsn+"'><div>"
								   +"<input class='thirdCheck'type='checkbox'style='margin-left:20px;'sort='2' onclick='thirdChose(this)'name='"+now_name+"' value='0'>"
							       +"</div><input disabled='' class='firstVarieties'value='"+interAll[i].details[j].third[k].prt+"'>";
							   }
						}
						   international +="</ul></li>" ;
					   }
				   international += "</ul></li>";
		}
		$("#internationals").html(international);
	}
	
	//确认查询
	function getSearchResult(){

		var keyWord = $(".part1").val();
		var standardStatus = $("#state").attr("state");
		var international = $("#international").attr("result");
		var national = $("#national").attr("result");
		var standardSort = $("#varieties").attr("result");
		
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
//				$("#loading").hide();
			}
		});
	}
	
