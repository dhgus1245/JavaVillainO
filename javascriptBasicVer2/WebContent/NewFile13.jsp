<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
   function myFunction() {
      var x = document.getElementById("inputNum").value;
      x = x.length;
      alert("Length : "+x);
   }
</script>

</head>

<body>
   <p>Select anew car from the list.</p>
   
   <input id = "inputNum" type="text" onchange="myFunction();">
	<p id="demo"></p>


</body>
</html>