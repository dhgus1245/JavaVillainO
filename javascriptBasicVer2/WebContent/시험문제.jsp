<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>

<body>

   <form action="NewFile.jsp"> //input이 있다면 form태그로 감싸주어야 한다(input 태그의 값을 이용한다)__button은 
   
      <br>
      1.숫자를 입력해주세요 <input id='yourNumber1' type="text">
      <br>
      2.숫자를 입력해주세요 <input id='yourNumber2' type="text">
      <!-- input객체 선언시 value는 초기값으로 지정되어 있으므로 value=""를 굳이 적지 않아도 된다 -->
	  <br>
	  <br>
	  
      <div>
         <input type="button" value="inputButton" >
         
         <input type="submit" value="submitButton" onclick="nameFnc();">
         <button onclick="nameFnc();">button태그</button>
      </div>
   </form>
  
   <a href = "시험문제.jsp">
   <img alt="이미지가즈아" src="./images/img1.jpg" style="width:100px; height:100px;">
   </a>
   
   
   <div style="border: 1px solid black; padding: 10px; background-color: buttonface;;" >
  		<a href ="NewFile4.jsp">
   		와우 나만의 태그
   </a>
   </div>
   
   
   <a href ="NewFile4.jsp">
   		와우 나만의 태그
   </a>
   
 
</body>
<script type="text/javascript">
   
   
   function nameFnc() {
	alert('신기하네');
}
</script>

</html>