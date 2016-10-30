
var page = 1;
var totalPage ;
window.onload = function(){	
	console.log(page);
	$(".main").dropload({
		scrollArea : window,
		loadDownFn : function(me) {
			    console.log(page);
			  
		 setTimeout(function() {
				page++;
				if(page <= 30 && page <= totalPage){
					console.log(page);
					judgeUserID();
					me.resetload();
				}else {
					$(".pull").fadeIn(1000);
					$(".pull").fadeOut(1000);
					me.resetload();
					return;
				}
		 	},1000);
		}
	});
	
	judgeUserID();
};

//添加跟踪列表测试号:Hiliuyan 密码：123456ly 添加标准号：6965182（AA AECH-1989），6965186（ AA F-1-1992）


//判断userID并显示已跟踪内容
function judgeUserID(){
//	var userName = ["xiaoya_0822","1","10"];
//	var userName = ["ss","1","10"];
	$("#loading").show();
	console.log("lla");
	var userName = ["",page,"10"];
//	var userName = ["","",""];
	var portName = "getUserStandardTracking";
	var returnType = "StandardTracking";
	$.ajax({
		type : "POST",
		url : "../../servlet/GetPortServlet",
		data : {
			parameterList : userName,
			portName : portName,
			returnType : returnType
		},
		traditional : true,
		async : false,
		success : function(data) {
				
			if(data == "false"){
				var result = confirm("您还没有绑定微信，确定绑定吗？");
				if(result ==true) {
					window.location.href = "/standard/webApp/account/account.html";
				}
				else {
					window.close();
				}
				return;
			} else {
				var pushList = judgeChanges();
				var allDatas = $.parseJSON(data);
				var allData = [];
				for(var k = 0; k < allDatas.length; k++){
					if(pushList == "" || pushList == undefined){
						allData = allDatas;
					}
					for(var m = 0 ; m < pushList.length; m++){
						if(allDatas[k].a001 == pushList[m].OA001){
							allData.unshift(allDatas[k]);
						}else{
							allData.push(allDatas[k]);
						}
					}
				}
				console.log(allData);
				if(allData == ""){
					console.log("数据为空");
					$("#empty").show();
					$("#loading").hide();
					return;
				}
				totalPage = allData[0].pagination.totalPageNum;
				if( page > totalPage){
					 return;
				}
				var list = "";
				for(var i = 0; i < allData.length; i++){
					var chinese = allData[i].a298A302.split("<br>");
					list += "<div class='detail'id="+allData[i].a001+" onclick='getDetails(this)'>"
								+"<div class='number'><span>"+allData[i].a100+"</span><span class='new'></span></div>";
							if(chinese != ""){
								list += "<div class='chineseName'>中文题名：<span>"+chinese[0]+"</span></div>";
								if(chinese[1] != undefined){
									list += "<div class='englishName'>英文题名：<span>"+chinese[1]+"</span></div>";
								}else{
									list += "<div class='englishName'>英文题名：<span>无</span></div>";
								}
										
							} else {
								if(allData[i].a298A302 != ""){
									list += "<div class='chineseName'>中文题名：<span>"+allData[i].a298A302+"</span></div>";
								} else {
									list += "<div class='chineseName'>中文题名：<span>无</span></div>";
								}
								list += "<div class='englishName'>英文题名：<span>无</span></div>";
								
							}
							
							list +="</div>";
				}
				
				$(".main").append(list);
			}
			$("#loading").hide();
			for(var i = 0; i < pushList.length; i++){
				$("#"+pushList[i].OA001).find(".new").text("NEW");
				$("#"+pushList[i].OA001).find(".new").attr("id",pushList[i].id);
			}
//			judgeChanges();
		}
	});
}

// 判断标准号是否有改变
function judgeChanges(){
		var userName = ["Hiliuyan"];
		var portName = "getUserStandardPushList";
		var returnType = "StandardPush";
		var allData = "";
		$.ajax({
			type : "POST",
			url : "../../servlet/GetPortServlet",
			data : {
				parameterList : userName,
				portName : portName,
				returnType : returnType
			},
			traditional : true,
			async : false,
			success : function(data) {
				allData = $.parseJSON(data);
				console.log("----------");
				console.log(allData);
				if(allData == ""){
					return;
				}
			}
		});
		return allData;
}
function getDetails(_this){
	if($(_this).find('.new').text() != ""){
		var id = $(_this).attr('id');
		var totalID = $(_this).find(".new").attr("id");
		console.log(id);
		console.log(totalID);
		window.location.href = "trackRes.html?id="+id+"&totalID="+totalID;
	} else {
		return;
	}
	
}