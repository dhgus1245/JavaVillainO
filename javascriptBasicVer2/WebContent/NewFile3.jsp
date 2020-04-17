<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
   <meta charset="UTF-8">
   <title>Insert title here</title>
   
<script type="text/javascript">

 	var array = [0,1,2];
 	var array2 = [[0],[array]];
 	
 	
 	for (var i = 0; i < array.length; i++) {
		array2[0][array[i]]=i;
	}
 	
 	for (var i = 0; i < array.length; i++) {
		document.write(0+", "+array2[0][i]+" ");
	}
 	
</script>

</head>

<body>

   
   
</body>
</html>