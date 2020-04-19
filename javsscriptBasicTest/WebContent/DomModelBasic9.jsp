<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>웹 문서구조</title>
</head>
<body>
 
</body>

<script type="text/javascript">





	function nowYYMMDD() {
		var today=new Date();
		var nowYear=today.getFullYear();
		var nowMonth=today.getMonth();
		var nowDate=today.getDate();
		document.write(nowYear+"-"+nowMonth+"-"+nowDate);
	}
	
	function lastYYMMDD(){
		var today=new Date();
		today.setFullYear(1987);
		today.setMonth(4);
		today.setDate(23);
		var lastYear=today.getFullYear();
		var lastMonth=today.getMonth();
		var lastDate=today.getDate();
		
		document.write(lastYear +"년"+lastMonth+"월"+lastDate+"일");
	}
	
	function nowTime(){
		var today=new Date();
		var nowHours=today.getHours();				//현재 시간 0~23
		var nowMinutes=today.getMinutes();		//현재 분 0~59
		var nowSeconds=today.getSeconds();	
		document.write(nowHours+":"+nowMinutes+":"+nowSeconds);
	}
	
	
	nowYYMMDD();//1번
	document.write("<br/>");
	
	lastYYMMDD();//2번
	document.write("<br/>");
	
	nowYYMMDD();//3번
	document.write("&nbsp");
	nowTime();
	
	
</script>
</html>





