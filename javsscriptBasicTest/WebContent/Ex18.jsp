<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>


</head>
<body>
	<div id='demo' onclick="mountainFnc()"  style="border: 2px dotted black; width : 300px; height: 300px">
	디모디모</div>
	
</body>

<script type="text/javascript">
	
	function mountainFnc() {
		
		var demoDiv = document.getElementById('demo');
			
		var Mountain1=["남산","도봉산","관악산","청계산","북한산"];
		var Mountain2=["설악산","지리산","한라산","속리산"];
		
		var mountainList = new Array();
		var count =0;
		
		
		for (var j = 0;  j< Mountain1.length; j++) {
			mountainList[count]=Mountain1[j];
			count++;
		}
		
		
		for (var j = 0;  j< Mountain2.length; j++) {
			mountainList[count]=Mountain2[j];
			count++;
		}
		
		
		for (var i = 0; i < mountainList.length; i++) {
			demoDiv.innerHTML += '<br/>'+ (i+1)+'. '+mountainList[i];
		}
	}
	
</script>

</html>

