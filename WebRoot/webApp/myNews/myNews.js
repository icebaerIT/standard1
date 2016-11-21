window.onload = function(){
	getData();
};

function back(_this){
	var this_class = $(_this).attr("class");
	console.log(this_class);
	if(this_class == "back"){
//		history.go(-1);
		window.location.href = "/standard/webApp/personal_Center/personal_Center.html";
	}else if(this_class == "back1"){
		$(_this).attr("class","back");
		window.location.reload();
	}else {
		console.log("back按钮class出错啦");
	}
};

function getData(){
	var userName = [""];
	var portName = "getUserStandardPushList";
	var returnType = "StandardPush";
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
				if(result == true) {
					window.location.href = "/standard/webApp/account/account.html";
				}
				else {
					window.close();
				}
				return;
			} else {
				var allDatas = $.parseJSON(data);
				console.log("有推送啦");
				console.log(allDatas);
				if(allDatas.length == 0){
					console.log("空");
					$("#empty").show();
					$("#context").hide();
				}else{
					var list_new = "";
					for(var i = 0; i < allDatas.length; i++){
						list_new += "<li id='"+allDatas[i].id+"' class='msg' onclick='pushFlag("+JSON.stringify(allDatas[i])+")'><span>"+allDatas[i].OA100+"</span>标准有新的推送消息</li>";
					}
					$("#context").html(list_new);
					$("#context").show();
					$("#empty").hide();
				}
			}
		}
	});
}

function pushFlag(data){
	$(".name").text("变更详情");
	$("#head").css("background-color","white");
	var totalID = data.id;
	console.log(totalID);
	console.log(data);
	var parameterList = ["Hiliuyan",totalID];
	var portName = "setUserStandardPushFlag";
	var returnType = "flag";
	$.ajax({
		type : "POST",
		url : "../../servlet/GetPortServlet",
		data : {
			parameterList : parameterList,
			portName : portName,
			returnType : returnType
		},
		traditional : true,
		async : false,
		success : function(data) {
			console.log(data);
			if(data == '1') {
				console.log("修改状态成功啦");
			}else{
				var html = "";
				var month = data.pushDate.time.month+1;
				var pushTime = data.pushDate.weekYear+"-"+month+"-"+data.pushDate.time.date;
					html += "<div class='old_info'>"
								+"<div class='title'>"
									+"<img src='img/scope.png'></img>"
									+"<span>原标准信息</span>"
								+"</div>"
								+"<ul class='old_list'>"
									+"<li><div>原标准号：</div><div>"+data.OA100+"</div></li>"
									+"<li><div>原标准题名：</div><div>"+data.OA298_A302+"</div></li>";
									if(data.OA000 == "A" || data.OA000 == "N"){
										html+="<li><div>原标准状态：</div><div>实施</div></li>";   //"+result[i].OA000+"
									} else if(data.OA000 == "D"){
										html+="<li><div>原标准状态：</div><div>废弃</div></li>";
									} else {
										console.log("OA000为非A，N，D");
									}
									html+="<li><div>原标准作废日期：</div><div>"+data.OA206+"</div></li>"
								+"</ul>"
							+"</div>"
							+"<div class='new_info'>"
								+"<div class='title'>"
									+"<img src='img/information.png'></img>"
									+"<span>新标准信息</span>"
								+"</div>"
								+"<ul class='new_list'>"
									+"<li><div>新标准号：</div><div>"+data.NA100+"</div></li>"
									+"<li><div>新标准题名：</div><div>"+data.NA298_A302.split('<br>')[0]+"</div></li>";
									if(data.NA000 == "A" || data.NA000 == "N"){
										html += "<li><div>新标准状态：</div><div>实施</div></li>";  //+result[i].NA000+
									} else if( data.NA000 == "D" ){
										html += "<li><div>新标准状态：</div><div>废弃</div></li>";
									} else {
										console.log("NA000为非A，N，D");
									}
									html += "<li><div>新标准发布日期：</div><div>"+data.NA101+"</div></li>"
									+"<li><div>实施/试行日期：</div><div>"+pushTime+"</div></li>" //"+result[i].pushDate+"
									+"<li><div>与原标准关系：</div><div>"+data.relation+"</div></li>" //"+result[i].relation+"
								+"</ul>"
							+"</div>"; 
					$(".main").html(html);
					$(".main").show();
					$("#context,#empty").hide();
					$(".back").attr("class","back1");
			}
		}
	
	});
}