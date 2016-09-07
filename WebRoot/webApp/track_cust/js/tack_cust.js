


function back(){
	history.back(-1);
}
$(document).ready(function(){
	console.log($("#basic-info")[0].clientWidth);
	$("#basic-info p").css("width",$("#basic-info")[0].clientWidth-20-52+"px");
	if(document.referrer == ""){
		$(".back").css("display","none");
		$(".head strong").css("margin-left","0px");
	}
});


