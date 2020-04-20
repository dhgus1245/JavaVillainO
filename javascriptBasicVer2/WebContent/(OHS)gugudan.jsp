<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

</style>
<script type="text/javascript">
var space = '&nbsp;';
var result = '';
var putNum = 0;


function setGugudan(inputNum){
   putNum=inputNum;
}


function getGugudan(){
	for(var i=1; i<10; i++){
	      var mulNum = putNum*i;
	      space = space+'&nbsp;';
	      result += putNum+space+"*"+space+i+space+"="+space+mulNum+"<br/>"
	   }
   return document.write(result);
}

setGugudan(8);
getGugudan();


	

</script>

</head>

<body>

</body>
</html>