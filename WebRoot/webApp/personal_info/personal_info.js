


userInfo1();
function userInfo1() {
	/* var parameterList = ["xiaoya_0822"]; */
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
			if(list != false){
				
				length = list.length;

				var url = "noImg";
				if(list[0].url != null){
					url = list[0].url;
				};
				var Blance = list[0].accountBlance;
				var Role = list[0].accountRole;
				if(Blance == "" || Blance == undefined || Blance == null){
					Blance = 0;
				}
				if(Role == "" || Role == undefined || Role == null){
					Role = 0;
				}
				//var url = "http:\/\/wx.qlogo.cn\/mmopen\/cPCNP1v1wjt2eic09JIvHKtME1exh1w1Ekwa3YxEJKovXYXB4ZTUbjXWgPzz07tQVkibgnnyl93evhf20gDgW9hbeUcnficUficl\/0";
				var newurl = url.substring(0, url.length - 2) + "/46";
				newurl = url.replace(/\\/g, "");
				$("#pic").attr("src", newurl);
				$("#userName").html(list[0].nickname);
				$("#userBlance").html("￥" + Blance);
				$("#userGrade").html(tRole + "&nbsp&nbsp");
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
function pre1() {
		history.go(-1);
}