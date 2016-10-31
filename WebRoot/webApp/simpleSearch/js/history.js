

var h_history = localStorage.getItem("history_standard_cssn");//获取历史记录
var serach_history = "";
console.log("历史记录是");
console.log(h_history);
var list_history = new Array();//及时记录数组长度为7lengt
$(document).ready(function(){
	console.log("开始读取历史记录");
	load_history();
	
	}
);
document.getElementById("search").onclick = 
	function(){
		serach(0);
		save_history();
	};



function load_history(){//读取历史记录并且打印
	document.getElementById("history-element-list").innerHTML = h_history; 
	var element_history = document.getElementsByClassName("history-element");
	for(var i = 0; i < element_history.length; i++){
		element_history[i].onclick = function(){
			//还是历史搜索
			
			serach_history = this.innerHTML;
			console.log("开始历史搜索:" + serach_history);
			 $("#serachkeyword").val(serach_history);
			serach(3);
			
		};
	}
}
	
	


function save_history(){
	console.log("开始保存历史记录");
	var element_history = document.getElementsByClassName("history-element");
	var length = element_history.length;
	console.log(length);
	var val_search= $("#serachkeyword").val();
	var repeat_history = 0;//判断历史是否重复重复则不保存0代表不重复,1代表重复
	
	for(var i = 0; i < length ; i ++){
		var a = element_history[i].innerHTML;
		if(val_search == a){
			repeat_history = 1;
			break;
		}

	}
	
	if(repeat_history == 0){//如果没哟重复就把历史记录放上去
		if(length < 7){
			$("#history-element-list").prepend("<li class='history-element'>"+val_search+"<img class='next' src='img/next.png'></li>");
		}else{
			$("#history-element-list li:eq(6)").remove();
			$("#history-element-list").prepend("<li class='history-element'>"+val_search+"<img class='next' src='img/next.png'></li>");
			
		}	
	}
	console.log("搜索内容是:" + val_search);
	localStorage.setItem("history_standard_cssn",document.getElementById("history-element-list").innerHTML);
	
}


	

