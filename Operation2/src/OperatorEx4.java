
public class OperatorEx4 {

	public static void main(String[] args) {
		
//		논리연산자
		int n =10;
		
		System.out.println(10>=20||10<=20);//앞에가 true가 되는 순간 뒤에것은 계산되지 않는다
		System.out.println(10>=20|10<=20);//앞에가 true가 되어도 뒤에것도 계산
		System.out.println(n>=20&&n<=20);//앞에것이 false인순간 뒤에것은 계산되지 않음
		System.out.println(n>=20&n<=20);// 앞에가 false라도 뒤에것은 계산
		
	}
}
