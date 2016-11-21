// 食品安全00000000-0000-0000-0000-000000060002 8083条数据
// 农产品00000000-0000-0000-0000-000000060003 9770条数据
// 抗震救灾　00000000-0000-0000-0000-000000060005 1413条数据
// 流行病防治00000000-0000-0000-0000-000000060004 168条数据  已处理

var length, start, page = 1, end = 10;
var list = [];
var context = "";
var parameter = $.getUrlParam("parameter");
$(function() {
var title = "";
	showContext();
	if(parameter == "00000000-0000-0000-0000-000000060002"){
		title = "食品检测专题";
	}else if(parameter == "00000000-0000-0000-0000-000000060003"){
		title = "农产品专题";
	}else if(parameter == "00000000-0000-0000-0000-000000060005"){
		title = "抗震救灾专题";
	}else if(parameter == "00000000-0000-0000-0000-000000060004"){
		title = "流行疫病防治专题";
	}
	$("#title").html(title);
	
});

function showContext() {
	var parameterList = parameter;
	var portName = "getTopicCatesult";
	var returnType = "base";
	$("#hah").css("display","block");
	$.ajax({
				type : "POST",
				url : "../../../servlet/GetPortServlet",
				data : {
					parameterList : parameterList,
					portName : portName,
					returnType : returnType
				},
				traditional : true,
				async : false,
				success : function(data) {
					console.log(data);
//					alert("come in");
					$("#hah").css("display","none");
					if (data == "" || data == undefined) {
						console.log("没有数据");
						alert("还没有数据额！！");

					} else {
						list = $.parseJSON(data);
						length = list.length;
						console.log(length);
						console.log("状态"+list[0].state);
						if (end > length) {
							end = length;
						}
						for ( var i = 0; i < end; i++) {
							var english_name = "";
							if (list[i].A302 != undefined) {
								english_name = list[i].A302;
							} else {
								english_name = "无";
							}

							if (i == 0) {
								context += "<div class='msg' id='first_msg' onclick='getDetail("
										+ i
										+ ")'>"
										+ "<p class='number'>"
										+ list[i].A100
										+ "&nbsp;&nbsp;<span class='status'>&nbsp;&nbsp;"
										+ "现行"/* list[i].state */
										+ "&nbsp;&nbsp;</span>"
										+ "</p>"
										+ "<p class='chinese_Name'>中文名称："
										+ list[i].A298
										+ "</p>"
										+ "<p class='english_Name'>英文名称："
										+ english_name + "</p>" + "</div>";
							} else {
								context += "<div class='msg' onclick='getDetail("
										+ i
										+ ")'>"
										+ "<p class='number'>"
										+ list[i].A100
										+ "&nbsp;&nbsp;<span class='status'>&nbsp;&nbsp;"
										+ "现行"/* list[i].state */
										+ "&nbsp;&nbsp;</span>"
										+ "</p>"
										+ "<p class='chinese_Name'>中文名称："
										+ list[i].A298
										+ "</p>"
										+ "<p class='english_Name'>英文名称："
										+ english_name + "</p>" + "</div>";
							};
							start = i;
						};
						$("#context").append(context);
					}
				}
			});

}
// 下拉刷新
$('#context').dropload({
	scrollArea : window,
	loadDownFn : function(me) {
		// 为了测试，延迟1秒加载
		setTimeout(function() {
			page++;
			getMore();
			me.resetload();
		}, 1000);
	}
});
// 刷新的内容
function getMore() {
	context = "";
	var end = start + 10;
	if (end > length) {
		end = length;
	}
	for ( var i = start; i < end; i++) {
		var english_name = "";
		if (list[i].A302 != undefined) {
			english_name = list[i].A302;
		} else {
			english_name = "无";
		}
		context += "<div class='msg' onclick='getDetail(" + i + ")'>"
				+ "<p class='number'>" + list[i].A100
				+ "&nbsp;&nbsp;<span class='status'>&nbsp;&nbsp;" + "现行"/* list[i].state */
				+ "&nbsp;&nbsp;</span>" + "</p>"
				+ "<p class='chinese_Name'>中文名称：" + list[i].A298 + "</p>"
				+ "<p class='english_Name'>英文名称：" + english_name + "</p>"
				+ "</div>";
	}
	start = i;
	$("#context").append(context);
	// console.log("i"+start+"length"+end);
}
//查看详细信息
//function getDetail(j) {
//	var detail = "";
//	var english_name = "";
////	判断是否有英文名
//	if (list[j].A302 != undefined) {
//		english_name = list[j].A302;
//	} else {
//		english_name = "无";
//	}
////	判断状态！！！目前数据库里没有相关数据，全部显示为废止
////	if (list[j].A100 != "现行") {
////		$(".status").css("background-color","green");
////	} else {}
//	
//	detail += "<div class='detail_msg'  onclick='back()'>" + "<p class='number' >" + list[j].A100
//			+ "&nbsp;&nbsp;<span class='status'>&nbsp;&nbsp;" + "现行"/* list[j].A100 */
//			+ "&nbsp;&nbsp;</span></p>" + "<p class='chinese_Name'>中文名称："
//			+ list[j].A298 + "</p>" + "<p class='english_Name'>英文名称："
//			+ english_name + "</p>" + "</div>";
//
//	$("#detail").html(detail);
//	$("#detail").css("display", "block");
//	$("#context").css("display", "none");
//}
// 返回列表页面
//function back(){
//	$("#context").css("display", "block");
//	$("#detail").css("display", "none");
//}
//返回上一页
function pre(){
	history.go(-1);
}


	  