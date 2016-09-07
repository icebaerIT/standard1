
$(document).ready(function(){
	$("body").prepend('<div id="top"    ><span onclick="javascript :history.back(-1);">返回</span></div>');
	console.log("==========");
	console.log(document.referrer);
	if(document.referrer == ""){
		$("body").css("padding-top","0px");
		$("#top").hide();
	}
});

