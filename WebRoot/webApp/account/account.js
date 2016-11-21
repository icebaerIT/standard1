function acc_bind() {
	var loginName = $("#name").val();
	var password = $("#password").val();

	console.log(password);
	if (loginName == "") {
		alert("请输入账号！");
	} else if (password == "") {
		alert("请输入密码!");
	} else if (loginName != "" && password != "") {

//		var parameterList = [ "xiaoya_0822", password ];
		var parameterList = [ loginName, password ];
		var portName = "loginNameValidation";
		var returnType = "base_loginName";

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

				if (data == "" || data == undefined || data == "false" || data == null ) {
					alert("账号或密码错误!");
					//history.go(-1);
				} else if (data == "true") {
					alert("绑定成功");
					window.location.href = "/standard/webApp/personal_Center/personal_Center.html";
				} else {
					alert("未知结果" + data);
				}
			}
		});
	}
}

//创建临时账号
function acc_creat(){
	
	var parameterList = [];
	var portName = "";
	var returnType = "base_register";
	
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

			if (data == "" || data == undefined || data == "false") {
				alert("创建临时账号失败!");
				//history.go(-1);
			} else if (data == "true") {
				alert("创建成功");
				window.location.href = "/standard/webApp/personal_Center/personal_Center.html";
			}else{
				alert("未识别指令");
			}
		}
	});
}




//判断是否已经绑定
function judg_bind(){
	
	
	
	
	var parameterList = [];
	var portName = "";
	var returnType = "isBind";
	console.log("!!!!");
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
			data = $.parseJSON(data);
			console.log(data);
			var ID = data.ID;
			data = data.isBind;
			
			
			if (data == "" || data == undefined || data == "NoAll") {
				
				console.log("账号没有绑定!");
				
			} else if (data == "true") {
				
				console.log("账号已经绑定成功!");
				
				document.getElementById("bind-success").innerHTML = "用户已经绑定,账号为: "+ID+" ";
				$('#name').attr("disabled",true);
				$('#password').attr("disabled",true);
				$('#bind-success').css("display","block");
				$('.creat_confirm').css("display","none");
				
			}else if(data == "false"){
				
				console.log("这只是个临时账号");
				$("#creat").attr("onclick","");
				$("#creat").css("background-color","#efefef");
				
			}
		}
	});
	
}
	
	

// 返回上一页
function pre() {
	history.go(-1);
}

$(document).ready(function(){
	console.log("开始");
	judg_bind();
});

//获取get信息
function getUrlParam(name) {

    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象
    var r = window.location.search.substr(1).match(reg);  //匹配目标参数
    if (r != null) return unescape(r[2]); return null; //返回参数值



}