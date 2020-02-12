
public class VarTest1 {
//variable 변수
//변수란 단 하나의 값을 저장할 수 있는 메모리 공간
// 하나의 변수에 단 하나의 값만 저장가능

/*
 * ctrl+/ : 한 줄 주석
 * ctrl+shift+/ : 범위주석
 * ctrl+shift+\ : 주석 해제
 * 보라색은 예약어
 * 갈색은 변수명
 * ctrl+f11 : run
 * ctrl+space : 자동완성
 
	변수의 명명 규칙
	1. 대소문자가 구분되며 길이에 제한이 없다.
	- true와 True는 서로 다른 것으로 간주된다.
	2. 예약어를 사용해서는 안 된다.
	-true는 예약어라서 사용할 수 없지만, True는 가능하다.
	3. 숫자로 시작해서는 안 된다.
	- top10은 허용하지만 7up은 허용하지 않는다.
	4. 특수문자는 '_'와 $만을 허용한다.
	-$harp는 허용되지만, $#arp는 허용되지 않는다.
//  last_index_of ----파스칼표기법
	*/
	
//	클래스 명명규칙
//	1. 클래스 이름의 첫 클자는 항상 대문자로 한다.
//	- 변수와 매서드의 이름의 첫 글자는 항상 소문자로 한다.
//	2. 여러 단어로 이루어진 이름은 단어의 첫 글자를 대문자로 한다.
//	-lastIndexOf(변수), StringBuffer(클래스)   ---낙타표기법
//	3. 상수의 이름은 모두 대문자로 한다.
//	여러단어로 이루어진 경우'_'로 구분한다.
//	-PI, MAX_NUMBER

	
	
	public static void main(String[] args) {
		
		int year = 10;
		int age = 14;
		
		System.out.println(year);
		System.out.println(age);
		
		year  = age + 2000;
		age = age + 1;
		
		System.out.println(year);
		System.out.println(age);


	}

}
