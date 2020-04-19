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
	
	document.write("<h1>일주일을 출력하시오<h2><br />")
	
	var today=new Date();
	var nowDate=today.getDate();//일을 출력()
	today.setMonth(4);
	today.setDate(24);   //일을 25일로 지정 
	var nowDay=today.getDay();//요일출력
	
	weekFnc();
	
	function weekFnc() {
		if(nowDay==0){
			document.write("일요일");
		}else if(nowDay==6){
			document.write("토요일");
		}else if(nowDay==5){
			document.write("금요일");
		}else if(nowDay==4){
			document.write("목요일");
		}else if(nowDay==3){
			document.write("수요일");
		}else if(nowDay==2){
			document.write("화요일");
		}else if(nowDay==1){
			document.write("월요일");
		}	
	}
	
	
	
	
</script>
</html>





