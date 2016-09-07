var parameterList;
var returnType;

$(function(){
	
console.log(1);
});
function sure(){
	var name = $("#name").val();
	var password = $("#password").val();
//	parameterList = ["","","","","Q","","","","","","","1","10"];
//	var portName = "advencedSearch";
//	returnType = "QueryResult";
	parameterList = ["estartest1113","123456789"];
	var portName = "loginNameValidation";
    returnType = "base";
	
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
//			console.log(data);
			var aa = $.parseJSON(data);
			console.log(aa);
			console.log($.parseJSON(aa[0].resultStr));
			
		}
	});
}