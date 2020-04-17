<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>


</head>
<body>
	
	
</body>

<script type="text/javascript">
	
	var friendNameList = new Array();
	
	friendNameList[0]='이정주';
	friendNameList[1]='이환상';
	friendNameList[2]='정의광';
	friendNameList[3]='이환상';
	
	

	for (var i = 0; i <friendNameList.length; i++) {
		document.write('<h5>'+(i+1)+'&nbsp;'+friendNameList[i]+'<h5>');
	}
	
	
</script>

</html>

