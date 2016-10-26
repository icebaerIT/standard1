

document.getElementById("test").innerHTML = "啦啦啦";
userInfo1();
function userInfo1() {
	/* var parameterList = ["xiaoya_0822"]; */
	var parameterList = [];
	var portName = "getUserAccountInfo";
	var returnType = "UserAccountInfo";
	document.getElementById("test").innerHTML = "111";
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
			document.getElementById("test").innerHTML = "222";
			document.getElementById("test").innerHTML = list;
			if(list != false){
				
				length = list.length;
				alert(list);
				console.log(list);
				alert(list[0]);
				alert(list[0].url);
				
				console.log(list[0].accountRole);
				console.log("用户信息" + length);
				var url = "noImg";
				if(list[0].url != null){
					url = list[0].url;
				};
				//var url = "http:\/\/wx.qlogo.cn\/mmopen\/cPCNP1v1wjt2eic09JIvHKtME1exh1w1Ekwa3YxEJKovXYXB4ZTUbjXWgPzz07tQVkibgnnyl93evhf20gDgW9hbeUcnficUficl\/0";
				var newurl = url.substring(0, url.length - 2) + "/46";
				newurl = url.replace(/\\/g, "");
				console.log(url);
				console.log(newurl);
				$("#pic").attr("src", newurl);
				$("#userName").html(list[0].userLoginName);
				$("#userBlance").html("￥" + list[0].accountBlance);
				$("#userGrade").html(list[0].accountRole + "&nbsp&nbsp");
			}else{
				alert("用户失效,从新进入");
			}
			
		},
		error:function(e){
			alert("出错了!!!!");
			
		}
	});
}

// 返回上一页
function pre() {
	history.go(-1);
}