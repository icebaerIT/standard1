
window.onload = function(){
	var type = $.getUrlParam("type");
	chose(type);
};
function chose(type){
	if(type == "1"){ // 国际标准
		$("header strong").text("国际标准一级分类");
		showFirstInt(firInter);
		
	}else if(type == "2"){ // 国内标准
		$("header strong").text("国内标准一级分类");
		showFirstNat(firstNational);
		
	} else if(type == "3"){ // 标准品种
		$("header strong").text("标准品种一级分类");

		showFirstVariety(domain);
		showSecondVariety(firstVar,"ST_N_SBTS");
		showSecondVariety(secondVar,"ST_N_DB");
		showSecondVariety(thirdVar,"ST_N_CSIC");
		showSecondVariety(forthVar,"ST_F_INTER");
		showSecondVariety(fifthVar,"ST_F_NATIONAL");
		showSecondVariety(sixthVar,"ST_F_INSTITUTE");
	}else {
		console.log("传值出错啦！");
	}
}
// 国际标准分类第一级
function showFirstInt(context){
	var firstInter = "";
	for(var i = 0; i < context.length; i++){
		firstInter += "<li class='I"+context[i].icsn+"'>"
			+"<div class='check'><input id='I"+context[i].icsn+"'name='I"+context[i].icsn+"' type='checkbox' onclick='choseAll(this)'><label for='I"+context[i].icsn+"'></label></div>"
			+"<div><input class='content' disabled value='"+context[i].prt+"'></div>"
			+"<div onclick='nextInter(this)'><img class='right' src='img/right.png'></img></div>"
			+"</li>";
	}
	$(".inter-first-list").html(firstInter);
	$(".international").show();
	showInterSec();
	showInterThird();
}
// 国际标准分类第二级
function showInterSec(){
	var secondTree = "";
	for(var i = 0; i < interAll.length; i++){
		var secondInter = "";
		var new_element = document.createElement("ul");
		new_element.className = "I"+interAll[i].name;
		for(var j = 0; j < interAll[i].details.length;j++){
			var className = "I"+interAll[i].details[j].icsn.replace(/\./g,"_");
			secondInter += "<li class='"+className+"'>"
				+"<div class='check'>"
					+"<input id='"+className+"'name='I"+interAll[i].name+"' type='checkbox' onclick='choseSecInter(this)'>" 
					+"<label for='"+className+"'></label></div>";
				if(interAll[i].details[j].third){
					secondInter += "<div><input class='content' disabled value='"+interAll[i].details[j].prt+"'></div>"
						+"<div onclick='nextThirdInter(this)'><img class='right' src='img/right.png'></img></div>";
				} else {
					secondInter += "<div style='width:80%'><input class='content' disabled value='"+interAll[i].details[j].prt+"'></div>";
				}
				secondInter += "</li>";
		}
		$(new_element).html(secondInter);
		$(".inter-second-list").append(new_element);
	}
}
function showInterThird(){
	for(var i = 0; i < interAll.length; i++){
		for(var j = 0; j < interAll[i].details.length;j++){
			var thirdInter = "";
			var new_element = document.createElement("ul");
			new_element.className = "I"+interAll[i].details[j].icsn.replace(/\./g,"_");
			if(interAll[i].details[j].third){
				for(var m = 0; m < interAll[i].details[j].third.length; m++){
					var className = "I"+interAll[i].details[j].third[m].icsn.replace(/\./g,"_");
					thirdInter += "<li class='"+className+"'>"
						+"<div class='check'>" 
							+"<input id='"+className+"' class='inter' name='I"+interAll[i].name+"' type='checkbox' onclick='choseThird(this,0)'>"
							+"<label for='"+className+"'></label></div>"
						+"<div style='width:80%'><input class='content' disabled value='"+interAll[i].details[j].third[m].prt+"'></div>"
					+ "</li>";
				}
				$(new_element).html(thirdInter);
				$(".inter-third-list").append(new_element);
			}
		}
	}
}
function nextInter(_this){
	$("header strong").text("国际标准二级分类");
	$(".sure").hide();
	var this_id = $(_this).parent().attr("class");
	$(".back1").attr("class","back5");
	$(".inter-first-list,.inter-second-list ul").hide();
	$(".inter-second-list,.inter-second-list ."+this_id).show();
}
// 国际分类第三级
function nextThirdInter(_this){
	$("header strong").text("国际标准三级分类");
	var this_id = $(_this).parent().attr("class");
	console.log(this_id);
	$(".back5").attr("class","back6");
	$(".inter-second-list,.inter-third-list ul").hide();
	$(".inter-third-list,.inter-third-list ."+this_id).show();
	console.log($(".inter-third-list ."+this_id));
}
// 国际分类二级选择
function choseSecInter(_this){
	var this_id = $(_this).attr("id");
	var upper_grade = $(_this).parent().parent().parent().attr("class");
	var list = $(".inter-second-list ."+upper_grade+" .check input");
	var num = 0;
	if($(_this).is(":checked")){
		$(".inter-third-list ."+this_id+" .check input").prop("checked",true);
	}else{
		$(".inter-third-list ."+this_id+" .check input").prop("checked",false);
	}
	for(var i = 0; i < list.length; i++){
		if($(list[i]).is(":checked")){
			num++;
		}else{
			break;
		}
	}
	if(num == list.length){
		$(".inter-first-list ."+upper_grade+" .check input").prop("checked",true);
	}else{
		$(".inter-first-list ."+upper_grade+" .check input").prop("checked",false);
	}
}
//三级选择
function choseThird(_this,type){
	var className = "";
	if(type == 0){
		className = "inter";
	}else {
		className = "nat";
	}
	var this_id = $(_this).attr("id");
	var upper_grade = $(_this).parent().parent().parent().attr("class");
	var upper_listname = $(_this).attr("name");
	var list = $(".inter-third-list ."+upper_grade+" .check input");
	var num = 0;
	for(var i = 0; i < list.length; i++){
		if($(list[i]).is(':checked')){
			num++;
		}else {
			break;
		}
	}
	if(num == list.length){
		$("."+className+"-second-list ."+upper_grade+" .check input").prop("checked",true);
		$("."+className+"-second-list ."+upper_grade+" .check input").val(1);
		var upper_list = $(".inter-second-list ."+upper_listname+" .check input");
		var upper_num = 0;
		for(var j = 0; j < upper_list.length; j++){
			if($(upper_list[j]).is(':checked')){
				upper_num++;
			}else {
				break;
			}
		}
		if(upper_num == upper_list.length){
			$("."+className+"-first-list ."+upper_listname+" .check input").prop("checked",true);
		}
	}else{
		$("."+className+"-second-list ."+upper_grade+" .check input").prop("checked",false);
		$("."+className+"-first-list ."+upper_listname+" .check input").prop("checked",false);
	}
	
}
// 第一级全选
function choseAll(_this){
	var this_id = $(_this).attr("id");
	if($(_this).is(":checked")){
		$("input[name='"+this_id+"']").prop("checked",true);
	}else{
		$("input[name='"+this_id+"']").prop("checked",false);
	}
}

// 国内标准分类第一级
function showFirstNat(context){
	var firstTree = "";
	for(var i = 0 ; i < context.length; i++){
		firstTree += "<li class='"+context[i].cn+"'>"
				+"<div class='check'>" 
					+"<input id='"+context[i].cn+"' name='"+context[i].cn+"'type='checkbox' onclick='choseAll(this)'value='0'>" 
					+"<label for='"+context[i].cn+"'></label></div>"
				+"<div><input class='content' disabled value='"+context[i].prt+"'></div>"
				+"<div onclick='nextNat(this)'><img class='right' src='img/right.png'></img></div>"
			+"</li>";
	}
	$(".nat-first-list").html(firstTree);
	$(".national").show();
	showNatsec();
	showNatThird();
}
// 国内标准分类第二级
function showNatsec(){
	for(var j = 0; j < nat.length; j++){
		var secondNat = "";
		var new_element = document.createElement("ul");
		new_element.className = nat[j].name;
		for(var m = 0; m < nat[j].detail.length; m++){
			secondNat += "<li class='"+nat[j].detail[m].cn+"'>"
				+"<div class='check'>" 
					+"<input id='"+nat[j].detail[m].cn+"'class='secondNatCheck' name='"+nat[j].name+"' value='0' onclick='choseNatSec(this)' type='checkbox'>" 
					+"<label for='"+nat[j].detail[m].cn+"'></label></div>"
				+"<div><input class='content' disabled value='"+nat[j].detail[m].prt+"'></div>"
				+"<div onclick='nextThirdNat(this)'><img class='right' src='img/right.png'></img></div>"
			+"</li>";
		}
		$(new_element).html(secondNat);
		$(".nat-second-list").append(new_element);
	}
}
function showNatThird(){
	for(var j = 0; j < nat.length; j++){
		for(var m = 0; m < nat[j].detail.length; m++){
			var thirdNat = "";
			var new_element = document.createElement("ul");
			new_element.className = nat[j].detail[m].cn;
			for(var i = 0; i < nat[j].detail[m].third.length;i++){
				thirdNat += "<li class='"+nat[j].detail[m].third[i].cn+"'>"
				+"<div class='check'>" 
					+"<input id='"+nat[j].detail[m].third[i].cn+"'class='nat' name='"+nat[j].name+"' value='0' type='checkbox' onclick='choseThird(this,1)'>" 
					+"<label for='"+nat[j].detail[m].third[i].cn+"'></label></div>"
				+"<div><input class='content' disabled value='"+nat[j].detail[m].third[i].prt+"'></div>"
			+"</li>";
			}
			$(new_element).html(thirdNat);
			$(".nat-third-list").append(new_element);
		}
	}
}
function nextNat(_this){
	$(".sure").hide();
	var this_id = $(_this).parent().attr("class");
	$("header strong").text("国内标准二级分类");
	$(".nat-first-list,.nat-second-list ul").hide();
	$(".nat-second-list,.nat-second-list ."+this_id).show();
	$(".back1").attr("class","back3");
}
// 国内标准next第三级
function nextThirdNat(_this){
	var this_id = $(_this).parent().attr("class");
	$(".back3").attr("class","back4");
	$("header strong").text("国内标准三级分类");
	$(".nat-second-list,.nat-third-list ul").hide();
	$(".nat-third-list,.nat-third-list ."+this_id).show();
}
// 国内标准二级选择
function choseNatSec(_this){
	var this_class = $(_this).attr("id");
	var upper_grade = $(_this).parent().parent().parent().attr("class");
	var list = $(".nat-second-list ."+upper_grade+" .check input");
	var num = 0;
	if($(_this).is(':checked')){
		$(_this).val(1);
		$(".nat-third-list ."+this_class+" .check input").prop("checked",true);
		$(".nat-third-list ."+this_class+" .check input").val(1);
	}else{
		$(_this).val(0);
		$(".nat-third-list ."+this_class+" .check input").prop("checked",false);
		$(".nat-third-list ."+this_class+" .check input").val(0);
	}
	
	for(var i = 0; i < list.length; i++){
		if($(list[i]).is(':checked')){
			num++;
		}else {
			break;
		}
	}
	if(num == list.length){
		$(".nat-first-list ."+upper_grade+" .check input").prop("checked",true);
		$(".nat-first-list ."+upper_grade+" .check input").val(1);
	}else{
		$(".nat-first-list ."+upper_grade+" .check input").prop("checked",false);
		$(".nat-first-list ."+upper_grade+" .check input").val(0);
	}
}
// 标准品种分类第一级
function showFirstVariety(context){
	var firstTree = "";
	for(var i = 0 ; i < context.length; i++){
		firstTree += "<li class='"+context[i].id+"'>"
				+"<div class='check'><input id='"+context[i].id+"' name='"+context[i].id+"' type='checkbox' value='0' onclick='choseAll(this)'><label for='"+context[i].id+"'></label></div>"
				+"<div><input class='content' disabled value='"+context[i].description+"'></div>"
				+"<div onclick='nextVar(this)'><img class='right' src='img/right.png'></img></div>"
			+"</li>";
	}
	$(".var-first-list").html(firstTree);
	$(".variety").show();
}
// 标准品种分类第二级
function nextVar(_this){
	$(".back1").attr("class","back2");
	$("header strong").text("标准品种二级分类");
	$(".sure").hide();
	$(".var-first-list,.var-second-list ul").hide();
	var this_name = $(_this).parent().attr("class");
	var second_var = $(".var-second-list ul");
	for(var i = 0 ; i < second_var.length;i++){
		if(second_var[i].className == this_name){
			$(second_var[i]).show();
			break;
		}
	}
	$(".var-second-list").show();
}
function showSecondVariety(content,this_grade){
	$(".var-second-list").hide();
	var secondTree = "";
	var new_element = document.createElement("ul");
	new_element.className = this_grade;
	var upper_grade = $(".var-second-list");
	upper_grade.append(new_element);
	for(var i = 0 ; i < content.length; i++){
		secondTree += "<li class='"+content[i].id+"'>"
				+"<div class='check'><input id='"+content[i].id+"'class='varieties' name='"+this_grade+"' type='checkbox' onclick='choseSecVar(this)'value='0'><label for='"+content[i].id+"'></label></div>"
				+"<div><input class='content' disabled value='"+content[i].description+"'></div>"
			+"</li>";
	}
	$(".var-second-list ."+this_grade).html(secondTree);
}
// 标准品种二级选择
function choseSecVar(_this){
	var this_name = $(_this).attr("name");
	var num = 0;
	var this_list = $(_this).parent().parent().parent().find("input[name='"+this_name+"']");
	if($(_this).is(':checked')){
		$(_this).val(1);
	}else{
		$(_this).val(0);
	}
	
	for(var i = 0; i < this_list.length; i++){
		if($(this_list[i]).is(':checked')){
			num++;
		}else{
			break;
		}
	}
	if(num == this_list.length){
		$("#"+this_name).prop("checked",true);
		$("#"+this_name).val(1);
	}else{
		$("#"+this_name).val(0);
		$("#"+this_name).prop("checked",false);
	}
}
// 返回
function back(_this){
	var this_back = $(_this).attr("class");
	console.log(this_back);
	if(this_back == "back1"){
		window.history.back(); // 返回高级查询主页面
	}else if(this_back == "back2"){ // 从品种二级返回到一级
		$(".sure").show();
		$(".back2").attr("class","back1");
		$(".var-second-list").hide();
		$("header strong").text("标准品种一级分类");
		$(".var-first-list").show();
	}else if(this_back == "back3"){ // 从国内标准二级返回到一级
		$(".sure").show();
		$(".back3").attr("class","back1");
		$(".nat-second-list").hide();
		$("header strong").text("国内标准一级分类");
		$(".nat-first-list").show();
	}else if(this_back == "back4"){ // 从国内标准三级返回到二级
		$(".back4").attr("class","back3");
		$(".nat-third-list").hide();
		$("header strong").text("国内标准二级分类");
		$(".nat-second-list").show();
	}else if(this_back == "back5"){ // 从国际标准二级返回到一级
		$(".back5").attr("class","back1");
		$(".sure").show();
		$(".inter-second-list").hide();
		$("header strong").text("国际标准一级分类");
		$(".inter-first-list").show();
	}else if(this_back == "back6"){ // 从国际标准三级返回到二级
		$(".back6").attr("class","back5");
		$(".inter-third-list").hide();
		$("header strong").text("国际标准二级分类");
		$(".inter-second-list").show();
	}else {
		console.log("返回出错啦");
	}
}

// 确定选择
function sure(){
	var allID = [];
	var list = $(".varieties").length >= 1? $(".varieties"):($(".inter").length>=1 ? $(".inter"):($(".nat").length >=1? $(".nat"):""));
	for(var i = 0,j=0; i < list.length; i++){
		if($(list[i]).is(":checked")){
			allID[j] = $(list[i]).attr("id");
			j++;
		}
	}
	if($(".varieties").length >= 1){
		window.sessionStorage.variety = allID;
	}else if($(".inter").length >= 1){
		for(var j = 0; j < allID.length; j++){
			allID[j] = allID[j].slice(1).replace(/\_/g,".");
		}
		window.sessionStorage.inter = allID;
	}else if($(".nat").length >= 1){
		window.sessionStorage.nat = allID;
	}
	window.location.href = "/standard/webApp/nationalLibraryOfStandards/advancedQuery.html";
}
