<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>

   <p>Select a new car from the list.</p>

   <select id="mySelect" onchange="myFunction()">
      <option value="Audi">Audi</option>
      <option value="BMW">BMW</option>
      <option value="Mercedes">Mercedes</option>
      <option value="Volvo">Volvo</option>
   </select>

   <p>When you select a new car, a function is triggered which outputs
      the value of the selected car.</p>

   <p id="demo"></p>

</body>
<script type="text/javascript">
   function myFunction() {
      var x = document.getElementById("mySelect").value;
      alert("You selected: " + x);
   }
</script>

</html>