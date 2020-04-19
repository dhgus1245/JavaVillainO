<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>



</head>

<body>
   <div id='demo'>
   I can eat bananas all day
   </div>
   <button onclick="changeFnc();">버튼</button>

</body>

<script type="text/javascript">
   function changeFnc() {
	   document.getElementById('demo').innerHTML = solutionStr;
	}
   
    var questionStr = '';
    questionStr = 'I can eat bananas all day';
   
    var splitList=questionStr.split(" ");
   
	var solutionStr = splitList[4].replace('a', 'A')+' '+splitList[2]+' '+splitList[1]
	+' '+splitList[5]+' '+splitList[3]+' '+splitList[0].toLowerCase();
      
	
   
  
   
</script>

</html>







