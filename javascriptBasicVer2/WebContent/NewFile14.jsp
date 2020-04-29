<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	p{
		background-color:orange; 
	}

</style>
<script type="text/javascript">
	function bigImg() {
		var x = document.getElementById('myImg');
		x.style.height = "84px";
		x.style.width = "84px";
	}

	function normalImg() {
		var x = document.getElementById('myImg');
		x.style.height = "52px";
		x.style.width = "52px";
	}
	
	function colorFnc() {
		var x = document.getElementsByTagName('p');
		x[0].style.backgroundColor = "pink";
	}
	
	
	function NormalColorFnc() {
		var x = document.getElementsByTagName('p');
		x[0].style.backgroundColor = "orange";
	}
	
	function colorFnc2() {
		var x = document.getElementsByTagName('p');
		x[1].style.backgroundColor = "pink";
	}
	
	
	function NormalColorFnc2() {
		var x = document.getElementsByTagName('p');
		x[1].style.backgroundColor = "orange";
	}
</script>

</head>

<body>
	<img id='myImg' onmouseenter="bigImg()" onmouseleave="normalImg()"
		 border="0" src="./images/img1.jpg"
		alt="Smiley" width="32" height="32">

	<p onmouseenter="colorFnc()" onmouseleave="NormalColorFnc()">The function bigImg() is triggered when the user moves the mouse
		pointer onto the image.</p>
	<p onmouseenter="colorFnc2()" onmouseleave="NormalColorFnc2()">The function normalImg() is triggered when the mouse pointer is
		moved out of the image.</p>



</body>
</html>