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
					history.go(-1);
				} else if (data == "true") {
					alert("绑定成功");
					window.location.href = "/standard/webApp/personal_Center/personal_Center.html";
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
				history.go(-1);
			} else if (data == "true") {
				alert("创建成功");
				window.location.href = "/standard/webApp/personal_Center/personal_Center.html";
			}
		}
	});
}

// 返回上一页
function pre() {
	history.go(-1);
}