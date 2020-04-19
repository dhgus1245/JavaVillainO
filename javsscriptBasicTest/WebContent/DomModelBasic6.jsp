<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>웹 문서구조</title>
</head>
<body>
   <div id='firstExam'>
      <div>
         <h1>DOM(Document Object Model)</h1>
         <p>문서의 각 요소(객체)들을 구조화한 것입니다.</p>
      </div>

      <div>
         <h1>DOM(Document Object Model)2</h1>
         <p>문서의 각 요소(객체)들을 구조화한 것입니다.2</p>
         <p>문서의 각 요소(객체)들을 구조화한 것입니다.3</p>
      </div>

      <div>
         <button style="border: 1px solid black;" onclick="click1Fnc();">첫번째 문제 버튼</button>
         <button style="border: 1px solid black;" onclick="click2Fnc();">두번째 문제 버튼</button>
      </div>
   </div>
</body>

<script type="text/javascript">
	var borderList= document.getElementById('firstExam').children

	function click1Fnc()  {
		

		borderList[0].style.border='1px solid black';
		borderList[1].style.border='2px solid yellow';
		borderList[2].style.border='1px solid skyblue';
	}
	
	
	
	function click2Fnc() {
		var childObjList= borderList[1].children;
		
		for (var i = 0; i < childObjList.length; i++) {
			alert(childObjList[i].tagName);
		} 
	}
	
	
</script>
</html>





