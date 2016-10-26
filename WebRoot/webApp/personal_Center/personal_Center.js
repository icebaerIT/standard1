$(function() {
	alert("333");
	userInfo();
});

function userInfo() {
	// var parameterList = ["xiaoya_0822"];
	var parameterList = [];
	var portName = "getUserAccountInfo";
	var returnType = "UserAccountInfo";

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

					list = $.parseJSON(data);
					length = list.length;
					console.log(list);
					var url = "noImg";
					if(list[0].url != null){
						url = list[0].url;
					};
//					var url = "http:/\/wx.qlogo.cn\/mmopen\/cPCNP1v1wjt2eic09JIvHKtME1exh1w1Ekwa3YxEJKovXYXB4ZTUbjXWgPzz07tQVkibgnnyl93evhf20gDgW9hbeUcnficUficl\/0";
					var newurl = url.substring(0, url.length - 2) + "/46";
					newurl = url.replace(/\\/g, "");
					console.log(url);
					console.log(newurl);
					$("#acc-icon").attr("src", newurl);
					$("#userName").html(list[0].userLoginName);
				}
			});
}
// 跳转到个人信息
function show_detail() {
	window.location.href = "/standard/webApp/personal_info/personal_info.html";
}
// 跳转到账户绑定界面
function bind_Account() {
	window.location.href = "/standard/webApp/account/account.html";
}
// 跳转到留言界面
function msg_board() {
	window.location.href = "/standard/webApp/message_board/message_board.html";
}
// 跳转到跟踪列表界面
function track() {
	window.location.href = "/standard/webApp/track/track.html";
}
// 跳转到我的消息界面
function myNews() {
	window.location.href = "/standard/webApp/myNews/myNews.html";
}