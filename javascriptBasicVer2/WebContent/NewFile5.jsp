<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
<script type="text/javascript">

	function sum10() {
		
		var num1 = document.getElementById('yourNameObj').value;
		var num1 = Number(num1)+10;
		
		
		alert(num1);
	}

</script>

</head>
<body>

	숫자를 입력해 주세요
	<input id = "yourNameObj" type="text">
	
	
	<input type="button" value="계산버튼" onclick="sum10()">
	버튼을 누르면 누군가 적은 숫자를 +10해준다.

</body>
</html>

