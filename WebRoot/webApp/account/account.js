function acc_bind() {
	var loginName = $("#name").val();
	var password = $("#password").val();

	console.log(password);
	if (loginName == "") {
		alert("请输入账号！");
	} else if (password == "") {
		alert("请输入密码!");
	} else if (loginName != "" && password != "") {

		var parameterList = [ "xiaoya_0822", password ];
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

				if (data == "" || data == undefined || data == "false") {
					alert("账号或密码错误!");
					history.go(-1);
				} else if (data == "true") {
					alert("绑定成功");
					history.go(-1);
				}
			}
		});
	}
}
// 返回上一页
function pre() {
	history.go(-1);
}