<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
	
   
   function myFunction() {
      var x = document.getElementById("fname");
      x.value = x.value.toUpperCase();
      x.style.background = "white";
   }
   
   function myFocusFnc() {
	      var x = document.getElementById("fname");
	      x.style.background = "yellow";
	   }
   
   
   
</script>

</head>

<body>
   Enter your name:
   <input type="text" id="fname" onblur="myFunction();" onfocus="myFocusFnc()">
   
   <button>그냥 새로 페이지 만들지 말자 한번하고 이걸로 계속 도전</button>

</body>
</html>