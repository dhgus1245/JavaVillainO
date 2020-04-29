<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
   <meta charset="UTF-8">
   <title>Insert title here</title>   

</head>

<body>
   
   <input id='yourNumber1' type="text" value="">+
   <input id='yourNumber2' type="text" value="">
   =
   <input id='resultNumber' type="text" value="" >
   <input type="button" value="버튼이당" onclick="resultFnc();">
   <div>
         버튼을 클릭하면 사용자가 입력한 두 숫자를 더해서
         input 태그에 결과값을 출력한다.
   </div>
   
</body>
   <script type="text/javascript">
      
   
   
      function resultFnc() {
    	  var num1 = document.getElementById('yourNumber1').value;
    	  num1 = Number(num1);
          var num2 = document.getElementById('yourNumber2').value;
    	  num2 = Number(num2);
          
          var resultNum = num1+num2;
          
          document.getElementById('resultNumber').value = resultNum;
	}
   </script>
   
</html>