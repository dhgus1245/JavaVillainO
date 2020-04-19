<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>웹 문서구조</title>
		
	<script type="text/javascript">
		
		
		function click1Fnc(){
			var a =document.getElementById('firstExam');
			var b =a.getElementsByTagName('h1')
			b[0].style.backgroundColor="red";
			}
		
		function click2Fnc(){
			var a =document.getElementsByTagName('div');
			var b =a[1].getElementsByTagName('p')
			b[0].style.backgroundColor="hotpink";
			}
		function name() {
			div.p.style.backgroundColor="blue";	
			}
	</script>
	</head>
	<body>
		
		<div id='firstExam'>
			<h1>DOM(Document Object Model)</h1>
			<p>문서의 각 요소(객체)들을 구조화한 것입니다.</p>
		</div>
		<div>
			<h1>DOM(Document Object Model)2</h1>
			<p>문서의 각 요소(객체)들을 구조화한 것입니다.2</p>
			<p>문서의 각 요소(객체)들을 구조화한 것입니다.3</p>
		</div>
		<div>
			<button onclick="click1Fnc();" style="border: 1px solid black;">첫번째 문제버튼</button>
			<button onclick="click2Fnc();" style="border: 1px solid black;">두번째 문제버튼</button>
			<button onclick="click3Fnc();" style="border: 1px solid black;">세번째 문제버튼</button>
		</div>

	구조는 변경불가(아이디불가)
	첫번째 버튼-> h1의 배경색이 변함
	두번째 버튼-> 2번째의 p태그가 동일한 배경색으로 변환	
	</body>
	
	
</html>