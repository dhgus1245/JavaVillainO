<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	var x = 123;
	document.getElementById("demo").innerHTML = x.toString() + "<br>"
			+ (123).toString() + "<br>" + (100 + 23).toString();
</script>

</head>
<body>

	<h2>JavaScript Global Methods</h2>

	<p>The Number() method converts variables to numbers:</p>

	<p id="demo"></p>

</body>
</html>

