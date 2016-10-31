
window.onload = function(){
/*	var reg = new RegExp("(^|&)" + 'id' + "=([^&]*)(&|$)", "i");  
	var r = window.location.search.substr(1).match(reg);  
	if (r != null) {
		getData(unescape(r[2]));
	}*/
	
	
	var id = $.getUrlParam('id');
	var totalID = $.getUrlParam("totalID");
	getData(id,totalID);
};

function getData(id,totalID){
	console.log(id);
	
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
			var result = $.parseJSON(data);
			console.log(result);
			var html = "";
			for(var i = 0; i < result.length; i++){
				if(result[i].OA001 == id){
					var month = result[i].pushDate.time.month+1;
					if(month.toString().length == 1){
						month = '0'+month;
					}
					var pushTime = result[i].pushDate.weekYear+"-"+month+"-"+result[i].pushDate.time.date;
					html += "<div class='old_info'>"
								+"<div class='title'>"
									+"<img src='img/scope.png'></img>"
									+"<span>原标准信息</span>"
								+"</div>"
								+"<ul class='old_list'>"
									+"<li><div>原标准号：</div><div>"+result[i].OA100+"</div></li>"
									+"<li><div>原标准题名：</div><div>"+result[i].OA298_A302+"</div></li>";
									if(result[i].OA000 == "A" || result[i].OA000 == "N"){
										html+="<li><div>原标准状态：</div><div>实施</div></li>";   //"+result[i].OA000+"
									} else if(result[i].OA000 == "D"){
										html+="<li><div>原标准状态：</div><div>废弃</div></li>";
									} else {
										console.log("OA000为非A，N，D");
									}
									html+="<li><div>原标准作废日期：</div><div>"+result[i].OA206+"</div></li>"
								+"</ul>"
							+"</div>"
							+"<div class='new_info'>"
								+"<div class='title'>"
									+"<img src='img/information.png'></img>"
									+"<span>新标准信息</span>"
								+"</div>"
								+"<ul class='new_list'>"
									+"<li><div>新标准号：</div><div>"+result[i].NA100+"</div></li>"
									+"<li><div>新标准题名：</div><div>"+result[i].NA298_A302.split('<br>')[0]+"</div></li>";
									if(result[i].NA000 == "A" || result[i].NA000 == "N"){
										html += "<li><div>新标准状态：</div><div>实施</div></li>";  //+result[i].NA000+
									} else if( result[i].NA000 == "D" ){
										html += "<li><div>新标准状态：</div><div>废弃</div></li>";
									} else {
										console.log("NA000为非A，N，D");
									}
									html += "<li><div>新标准发布日期：</div><div>"+result[i].NA101+"</div></li>"
									+"<li><div>实施/试行日期：</div><div>"+pushTime+"</div></li>" //"+result[i].pushDate+"
									+"<li><div>与原标准关系：</div><div>"+result[i].relation+"</div></li>" //"+result[i].relation+"
								+"</ul>"
							+"</div>"; 
						console.log(result[i].pushDate);
					$(".main").html(html);
					return;
				}
			}
		}
	});
	
//	pushFlag(totalID);
}

function pushFlag(totalID){
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
				
			}
		}
	
	});
}