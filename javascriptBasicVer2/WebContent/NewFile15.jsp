<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

</style>
<script type="text/javascript">
	function NameAndBirthFnc() {
		document.getElementById('result')='이름 : '+getName+'\n'+'태어난 해 : '+getBirth;
	}
	function getName() {
		
	}
	function getBirth() {
		
	}
	
	window.onload = function() {//익명함수
		var myBtn = document.getElementById('divBtn');
		myBtn.onclick = tempFnc;
	}
	

</script>

</head>

<body>
	<div id = 'divBtn' style='border: 1px solid black'>버튼
	</div>
	
	<div>
	
	<span>이름</span><input type="text" value = "" >
	<span>태어난 해</span><input type="text" value = "">
	</div>
	
	
	<div id ="result">
		이곳 안의 내용이 결과로 출력되어야 하는 영역이다.
		이름 : 박성욱
		태어난 해 : 1987
	</div>


</body>
</html>