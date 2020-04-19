<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
	arrFnc(4, 5);

	function arrFnc(num, num2) {
		var count = 1;
		var arr = [];

		// 배열 넣기
		for (var i = 0; i < num; i++) {

			arr[i] = [];

			for (var n = 0; n < num2; n++) {

				arr[i][n] = count + '&nbsp';
				count++;
			}

		}

		// 출력
		for (var i = 0; i < arr.length; i++) {
			for (var n = 0; n < arr[i].length; n++) {
				document.write(arr[i][n]);

			}
			document.write('<br>');
		}

	}
	
	
	var obj = '';
	
	obj = {
			num : 100,
			myName : 'psu'
			
	}
	
	document.write(obj.num);
	document.write(obj.myName);
</script>

</head>

<body>




</body>
</html>