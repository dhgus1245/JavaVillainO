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
	var leapYear = new Array();
	var startYear = 2000;
	var endYear = 2020;
	var count = 0;

	for (var i = startYear; i <= endYear; i++) {
		if (i % 400 == 0) {
			leapYear[count++] = i + "년은 윤년이다" + '<br/>';
		} else if (i % 100 == 0) {
			leapYear[count++] = i + "년은 윤년이 아니다" + '<br/>';
		} else if (i % 4 == 0) {
			leapYear[count++] = i + "년은 윤년이다" + '<br/>';
		} else {
			leapYear[count++] = i + "년은 윤년이 아니다" + '<br/>';
		}
	}
	
	console.log(leapYear);
</script>

</html>

