<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	var teamMate = [];
	
	var array = new Arrray();
	array[1]=new Array();
	array[2]=new Array();
	teamMate[0] = {

		teamMateName : '오현석',
		teamMateAge : 27,
		teamMatePosition : '샌드백'

	}

	teamMate[1] = {

		teamMateName : '류제건',
		teamMateAge : 25,
		teamMatePosition : '발표자'

	}

	teamMate[2] = {

		teamMateName : '정의광',
		teamMateAge : 29,
		teamMatePosition : '고급팀원'

	}

	teamMate[3] = {

		teamMateName : '김윤진',
		teamMateAge : 30,
		teamMatePosition : '관망자'

	}

	var teamMatePrint = [];
	for (var i = 0; i < 4; i++) {
		teamMatePrint[i] = teamMate[i].teamMateName + '\n'
				+ teamMate[i].teamMateAge + '\n' + teamMate[i].teamMatePosition
				+ '\n'
	}
	for (var i = 0; i < 4; i++) {
		alert(teamMatePrint[i]);
	}

	/* 	var teamMate1In = '';
	 teamMate1In += teamMate.teamMateName + '\n';
	 teamMate1In += teamMate1.teamMateAge + '\n';
	 teamMate1In += teamMate1.teamMatePosition + '\n';
	
	 var teamMate2In = '';
	 teamMate2In += teamMate2.teamMateName + '\n';
	 teamMate2In += teamMate2.teamMateAge + '\n';
	 teamMate2In += teamMate2.teamMatePosition + '\n';
	
	 var teamMate3In = '';
	 teamMate3In += teamMate3.teamMateName + '\n';
	 teamMate3In += teamMate3.teamMateAge + '\n';
	 teamMate3In += teamMate3.teamMatePosition + '\n';
	
	 var teamMate4In = '';
	 teamMate4In += teamMate4.teamMateName + '\n';
	 teamMate4In += teamMate4.teamMateAge + '\n';
	 teamMate4In += teamMate4.teamMatePosition + '\n';
	

	 alert(teamMate1In);
	 alert(teamMate2In);
	 alert(teamMate3In);
	 alert(teamMate4In); */
</script>

</head>
<body>


</body>
</html>

