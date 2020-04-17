<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>


</head>
<body>
	
	<button onclick="input">입력</button>
	<button>출력</button>
</body>

<script type="text/javascript">

	function setGugudan() {
		
	}
	//var danList = ['2단', '3단', '4단', '5단', '6단', '7단', '8단', '9단'];
	var danList = new Array();
	var gugudanList = new Array();
	/* var dan = 0;
	var time = 0; */
	
	for (var i = 0; i <= 7; i++) {
		danList[i] = (i + 2) + '단';
	}
	
	for (var i = 2; i <= 9; i++) {
		document.write(danList[i - 2] + '<br/>');
		for (var j = 1; j <= 9; j++) {
			gugudanList[i - 2] = i * j;
			document.write(gugudanList[i - 2] + '&nbsp;&nbsp;&nbsp;');
		}
		document.write('<br/>');
	}


</script>

</html>

