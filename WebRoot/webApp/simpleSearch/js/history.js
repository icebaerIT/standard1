

var h_history = localStorage.getItem("history_standard_cssn");//获取历史记录
var list_history = new Array();//及时记录数组长度为7lengt
$(document).ready(
		
);
//对历史记录进行读取比较
function history(){
	
	
	
}

function remove_history(){
	
	
}


function load_history(){//读取历史记录并且打印

	if(h_history == "" || h_history == null ||h_history == undefined){
		
	}else{
		list_history = h_history.split(",");	
		for(var i = 0; i < list_history.length; i++){
			$("#history>ul").append("<li class='history-element'>"+list_history[i]+"</li>");
		}
	}
}
	
	


function save_history(){
	var element_history = document.getElementsByName("history-element");
	var length = element_history.length;
	var val_search= $("#serachkeyword").val();
	var string_history = "";
	
	
	
	if(length < 7 && i == length - 1){
		$("#history>ul").prepend("<li class='history-element'>"+val_search+"</li>");
	}else if(i == length - 1){
		$("#history>ul li:eq(6)").remove();
		$("#history>ul").prepend("<li class='history-element'>"+val_search+"</li>");
		
	}
	element_history = document.getElementsByName("history-element");
	length = element_history.length;
	for(var i = 0; i < length; i++){
		string_history = string_history+element_history[i].innerHTML;
		if(i < length-1){
			string_history = string_history + ",";
		}
		
	}
}
