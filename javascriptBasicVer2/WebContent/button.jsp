<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	
	function masterGugudanFnc(num) {

		var dan = num;
		var mul = '';
		var result = [];
		var str = '';
		
		for (var n = 1; n <= 9; n++) {
			mul = dan * n;
			result[n-1] = dan + ' * ' + n + ' = ' + mul + '\n';
			str += result[n-1];
		}
		alert(str);
	}
	
	function masterGugudanFnc2(text) {

		var num = text.trim();
		var sum = Number(num)+100;
		
		alert(sum);
	}
	
</script>	

</head>
<body>
	<div>
		<input type="button" onclick="masterGugudanFnc2('                        2       ');" value="2단">
		<input type="button" onclick="masterGugudanFnc('3단');" value="3단">
		<input type="button" onclick="masterGugudanFnc('4단');" value="4단">
	</div>
</body>
</html>

