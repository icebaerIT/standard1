var thePage = -1;//当前页面
var totalPage = 0;//总页数
var htmlORappend = 0;//0替换1向后加载
var parameterList = new Array();
parameterList[4] = 10;
dropload_me = $('#search-list').dropload.me;
var input_keyword = null;


function isNull( str ){
    if ( str == "" ) return true;
    var regu = "^[ ]+$";
    var re = new RegExp(regu);
    return re.test(str);
}

function back(){
	history.back(-1);
}

function RequestWebService(parameterList) {
//		parameterList = ["","","","","Q","","","","","","","1","10"];
//		var portName = "advencedSearch";
//		returnType = "QueryResult";
		var portName = "simpleSearch";
	    var returnType = "QueryResult";
	    //设置每页显示数量

		$.ajax({
			type : "POST",
			url : "../../servlet/GetPortServlet",
			data : {
				parameterList : parameterList,
				portName : portName,
				returnType : returnType
			},
			timeout:1000,
			traditional : true,
			async : false,
			success : function(data) {
				
				var aa = $.parseJSON(data);
				console.log(aa[0]);
				totalPage = aa[0].totalPage;
				$("#totalPage").html(aa[0].totalPage);
				console.log("总页数"+aa[0].totalPage);
				$("#thePage").attr("value",aa[0].pageIndex);
				thePage = aa[0].pageIndex;

				var data = $.parseJSON(aa[0].resultStr);
				var thelist = "";
				console.log(data);	
				for(var theData in data){
					var now = "现行";
					var now_Color = "state-green";
					switch(data[theData]["记录状态"]){
					case "N":;
					case "A":now = "现行";break;
					default:now = "废止",now_Color = "state-red";break;
					}
					thelist +="<li class='opacity'><a href='../details/details.html?id="+data[theData]["记录标识符"]+"'>"+
		 			"<div><p>"+data[theData]["文献号"]+"<span class='state "+now_Color+"'>"+now+"</span></p></div>"+
		 			"<div><p><span>中文题名:</span>"+data[theData]["中文题名"]+"</p></div>"+
		 			"<div><p><span>英文题名:</span>"+data[theData]["英文题名"]+"</p></div>"+
		 			"</a></li>";
					
				}
				console.log("读取画面关闭");
				$("#search").html("重搜");
				$("#loading").hide();
				
				switch(htmlORappend){
					case 0:console.log("替换");
							$("#search-list").html(thelist);
							break;
					case 1:	console.log("添加");
							$("#search-list").append(thelist);
							break;
					default:console.log("没有这个展示功能");
				}
				//没有数据时替换dropload-refresh的内容
				if(totalPage == 0){
					$("#nodata").show();
/*					dropload_me.noData();*/
				}else{
					$("#nodata").hide();
					//保存关键字
					sessionStorage.setItem("simpleSearch_keyword", $("#serachkeyword").val());	
					//保存整个页面
					sessionStorage.setItem("simpleSearch_object",$("#search-list").html());
					//保存当前页面thePage
					sessionStorage.setItem("simpleSearch_thePage",thePage);
					//保存总页面thePage
					sessionStorage.setItem("simpleSearch_totalPage",totalPage);
					console.log("已保存数据");
				}

				console.log("展示");
				$("#serachs").show();
				$("#Dsearch").show();

			},
			error:function(){
				console.log("读取画面关闭");
				$("#loading").hide();
				alert("查询失败");
				},
			complete : function(XMLHttpRequest,status){ //请求完成后最终执行参数
				if(status=='timeout'){//超时,status还有success,error等值的情况
					ajaxTimeoutTest.abort();
					alert("超时");
				}
				
			}
			
		});
}

function isNull(str){
	var regu = "^[ ]+$";
	var re = new RegExp(regu);
	return re.test(str);
}


$('#search-list').dropload({
    scrollArea : window,
    loadDownFn : function(me){
    	console.log("上拉读取");
    

    	if(thePage < 30 && thePage < totalPage){
    		htmlORappend = 1;
    		console.log("页数还可以继续");
    		setTimeout(serach(1),1000);
    		me.resetload();
    		me.unlock();
    	}else{
			$(".pull").fadeIn(1000);
			$(".pull").fadeOut(1000);
    		me.resetload();
    		console.log("没有更多了");
    	}
    	
    },
	});

function serach(type){
	

	console.log("查询开始");

	var serach = $("#serachkeyword").val();
	if(type == 3){
		serach = serach_history;
	}
	var theserach  = sessionStorage.getItem("simpleSearch_keyword");
//	存历史记录
	console.log("关键字"+serach);
	console.log("之前的关键字"+theserach);
	//查询状态
	if(serach != null && serach != "" && !isNull(serach) ){
		console.log("隐藏历史");
		$("#history").hide();
		//展示读取画面
		if(type == 0){
			$("#loading").show();
			thePage == 1;
			console.log("读取画面展开");
		}
		//查询的功能
		setTimeout(function(){
			switch(type){
			case 1:parameterList[3]= parseInt(thePage)+1 ;
					console.log("下一页是"+(thePage+1));
			case 0:
				parameterList[0]=serach;
				RequestWebService(parameterList);
				break;
			case 3:				
				parameterList[0]=serach;
				RequestWebService(parameterList);
				break;
			default:alert("不存在");
			}
		},300);
	}else{

		console.log("没东西");

		console.log("锁定拉读取");
		dropload_me.resetload();
	}
}

//跳转
function Dsearch(){
	//编码
	sessionStorage.setItem("keyWord",$("#serachkeyword").val());
	console.log("跳转" + escape($("#serachkeyword").val()));
	setTimeout(10000,window.location.href = "/standard/webApp/nationalLibraryOfStandards/advancedQuery.html?keyword=" + escape($("#serachkeyword").val()));
}

//只能输入数字的方法
function onlyNum(){
	console.log("修订");
	document.getElementById('thePage').value = document.getElementById('thePage').value.replace(/[^0-9-]+/,'');
	}



$(document).ready(function(){
	var keyword = sessionStorage.getItem("simpleSearch_keyword");
	if(keyword != null){
		$("#serachkeyword").val(keyword);
/*		$("#serachkeyword").css({
			"font-size": "30px",
			"margin-left":"25px",
			"margin-top": "0px",
		});*/
		console.log("有关键词"+ $("#serachkeyword").val(keyword));
		//获取整个页面
		var object = sessionStorage.getItem("simpleSearch_object");
		$("#search-list").html(object);
		console.log("过去数据为:"+object);
		//获取当前页thePage
		thePage = parseInt(sessionStorage.getItem("simpleSearch_thePage"));
		console.log("过去页数为:"+ sessionStorage.getItem("simpleSearch_thePage"));
		//获取总页totalPage			
		totalPage = parseInt(sessionStorage.getItem("simpleSearch_totalPage"));
		console.log("过去总页:" + sessionStorage.getItem("simpleSearch_totalPage"));
		$("#serachs").show();
		$("#Dsearch").show();
		console.log("已打印之前的数据");
	}
	if(document.referrer == ""){
		$(".back").css("display","none");
	}
});

//关键字输入框点击触发
$(document).on("touchend","#serachkeyword",function(){
	console.log("点击了input");
	$("#Dsearch").hide();
	$("#search").html("查询");
/*	$("#serachkeyword").css({
		"font-size": "17px",
	    "margin-left": "5px",
	    "margin-top": "10px",
	});*/
});



//切换为替换
$(document).on("touchend","#search",function(){
	console.log("替换整页");
	htmlORappend = 0;
});
