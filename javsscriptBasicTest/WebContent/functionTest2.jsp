<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
<script type="text/javascript">
	var num;
	
	function gugu1Fnc() {
		for (var i = 1; i <= 9; i++) {
			for (var j = 2; j <= 9; j++) {
				document.write(j+'*'+i+'='+(i*j)+' &nbsp&nbsp');	
			}
			document.write('<br/>');
		}
		document.write('<br/>');
		document.write('<br/>');
	}

	
	function gugu2Fnc(num) {
		document.write(num+'단');
		document.write('<br/>');
		for (var i = 2; i <= num; i++) {
			for (var j = 1; j <= 9; j++) {
				document.write(i+'*'+j+'='+(i*j)+' &nbsp&nbsp');	
			}
			document.write('<br/>');
		}
		document.write('<br/>');
		document.write('<br/>');
	}
	
	gugu1Fnc();
	gugu2Fnc(7);
</script>

</head>
<body>
	

</body>
</html>

