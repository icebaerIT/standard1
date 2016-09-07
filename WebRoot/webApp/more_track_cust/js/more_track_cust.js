


function back(){
	history.back(-1);
}
$(document).ready(function(){

	if(document.referrer == ""){
		$(".back").css("display","none");
		$(".head strong").css("margin-left","0px");
	}
});


