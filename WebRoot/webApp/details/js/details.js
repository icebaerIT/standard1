function getUrlParam(name) {
            var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象
            var r = window.location.search.substr(1).match(reg);  //匹配目标参数
            if (r != null) return unescape(r[2]); return null; //返回参数值
        }
function back(){
	history.back(-1);
}
function dealData(data){
	$("#titel-name").html(data[0]["A100"]);
	switch(data[0]["A000"]){
	case "N":;
	case "A":$("#titel-state").html("现行").css({'color':'#fff','background-color':'#3886ac'});break;
	default:/*$("#titel-state").html("现行").css({'color':'#fff','background-color':'#3886ac'});break;*/
		$("#titel-state").html("废止").css({'color':'#fff','background-color':'#ef4f4f'});break;
	}
	
	var info = '<li>'
				+	'<img class="text-top-align" src="../details/img/right.png"></img><p><span>中文题名 : </span>'+data[0]["A298"]+'</p>'
				+'</li>'
				+'<li>'	
					+'<img class="text-top-align" src="../details/img/right.png"></img><p><span>英文题名 : </span>'+data[0]["A302"]+'</p>'
				+'</li>'
				+'<li>'
					+'<img class="text-top-align" src="../details/img/right.png"></img><p><span>发布机构 : </span>'+data[0]["A104"]+'</p>'
				+'</li>'
				+'<li>'
					+'<img class="text-top-align" src="../details/img/right.png"></img><p><span>发布日期  : </span>'+data[0]["A101"]+'</p>'
				+'</li>'
				+'<li>'
					+'<img class="text-top-align" src="../details/img/right.png"></img><p><span>实施日期 : </span>'+data[0]["A205"]+'</p>'
				+'</li>'
				+'<li>'	
					+'<img class="text-top-align" src="../details/img/right.png"></img><p><span>全文语种 : </span>'+data[0]["A300"]+'</p>'
				+'</li>';
				var scope_info = '<li>'
					+'<p><span></span>'+data[0]["A330"]+'</p>'
				+'</li>';
				var category_info ='<li>'
						+'<p><span>中国标准分类号 : </span>'+data[0]["A825"]+'</p>'
					+'</li>'
					+'<li>'
						+'<p><span>国际标准分类号 : </span>'+data[0]["A826"]+'</p>'
					+'</li>';

				/*+'<li>'
					+'<p><span>适用范围 : </span>'+data[0]["A330"]+'</p>'
				+'</li>'
				+'<li>'
					+'<p><span>中国标准分类号 : </span>'+data[0]["A825"]+'</p>'
				+'</li>'
				+'<li>'
					+'<p><span>国际标准分类号 : </span>'+data[0]["A826"]+'</p>'
				+'</li>';*/
	$("#scope_info").html(scope_info);
	$("#category_info").html(category_info);
	$("#basic-info").html(info);
	console.log($("#basic-info")[0].clientWidth);
	$("#basic-info p").css("width",$("#basic-info")[0].clientWidth-20-45+"px");
	/*$("#bottom").html("<a href='../more_details/more_details.html?id="+getUrlParam("id")+"'>查看更多</a>");
*/	
}
$(document).ready(function(){
	//do something
	$("#loading").show();
   var id =  getUrlParam("id");
   var portName = "getStandardDetail";
   var returnType = "base";
   $.ajax({
   	url: '../../servlet/GetPortServlet',
   	type: 'POST',
   	dataType: 'json',
   	data: {
   		portName:portName,
   		parameterList: id,
   		returnType:returnType
   	},
   })
   .always(function() {
   })
   .done(function(data) {
	   if(data != null && data != ""){
		   	console.log(data);
			dealData(data);
	   }else{
		   	alert("数据不存在");
	   }
	   $("#loading").hide();
   })
   .fail(function() {
   });
   
});



function collect(){
	   var id = ["",getUrlParam("id")];
	   var portName = "setUserTracking";
	   var returnType = "setUserTracking";
	   console.log(id);
	   $.ajax({
		   	url: '../../servlet/GetPortServlet',
		   	type: 'POST',
		   	data: {
		   		portName:portName,
		   		parameterList: id,
		   		returnType:returnType
		   	},
		   	traditional : true,
			async : true,
			success : function(data) {}
		   });
	   $.ajax({
		   	url: '../../servlet/GetPortServlet',
		   	type: 'POST',
		   	data: {
		   		portName:portName,
		   		parameterList: id,
		   		returnType:returnType
		   	},
		   	traditional : true,
			async : true,
			success : function(data) {
				   if(data != null && data != ""){
					   	console.log(data);
					   	switch(data){
					   	case "1":alert("跟踪成功");break;
					   	case "2":alert("已经跟踪");break;
					   	case "0":alert("跟踪失败");break;
					   	case "bind":
					   		if(confirm("你的账户未绑定,需要绑定点确定")){
					   			window.location.href = "/standard/webApp/account/account.html";
					   		}
					   		;break;
					   	default:alert("未知情况");break;
					   	}
				   }else{
					   	alert("数据不存在");
				   }
			},
		   	error:function(){
		   		alert("访问出错");
		   	}
		   });
}