<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
<script type="text/javascript">
	var num1 = 0;
	var num2 = 0;
	
	function pluseTneFnc() {
		
		var inputNum = document.getElementById('yourNumber1').value;
		var num1 = Number(inputNum)+10;
		//inner
		document.getElementById('yourNumber1').value = num1;
	}
	
	function pluseEach() {
		
		var inputNum = document.getElementById('yourNumber1').value;
		var num1 = Number(inputNum);
		
		inputNum = document.getElementById('yourNumber2').value;
		var num2 = Number(inputNum);
		//inner
		alert(num1+num2);
	}
	

</script>

</head>
<body>

	숫자를 입력해 주세요
	<input id = "yourNumber1" type="text" value="" >
	<input id = "yourNumber2" type="text" value="" >
	
	<input type="button" value='+10버튼' onclick="pluseTneFnc();">
	<button onclick="pluseEach();">두수를 더하는 버튼</button>

</body>
</html>

