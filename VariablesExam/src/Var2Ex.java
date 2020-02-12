
public class Var2Ex {
	public static void main(String[] args) {
//		변수의 타입
//		값의 종류
//		1. 문자
//		2. 숫자
//		-정수
//		-실수
		
		
//		기본형과 참조형
//		기본형(primitive type)
//		-논리형(boolean) : ture와 false 중 하나를 값으로 가지며, 조건식과 논리적 계산에 사용된다
//		-문자형(char) : 문자를 저장하는데 사용되며, 변수 당 하나의 문자만 저장할 수 있다
//		-정수형(byte, short, int, long) : 정수값을 저장하는 데 사용된다
//		-실수형 (float, double) : 실수를 저장하는데 사용되며 주로 double이 사용된다
//		계산을 위한 실제 값을 저장한다
//		
//		표현범위
//크기(byte)   1		   2	 4     8
//			boolean - char - int- long
//			byte - short -float - double
//		참조형(reference type)
//		- 객체의 주소를 저장한다.8개의 기본형을 제외한 나머지 타입
		
		boolean check = false;
		char ch =66;
		byte bNum = (byte)127;//256(2의 7승)
		int num = 2000000000;
		long lNum = 22000000000L;
		float f = 0.01224552f;
		double dNum= 0.123;
		
		
		
		System.out.println(bNum);
		System.out.println(check);
		System.out.println(ch);
		System.out.println(num);
		System.out.println(lNum);
		System.out.println(f);
		System.out.println(dNum);
	}
}
