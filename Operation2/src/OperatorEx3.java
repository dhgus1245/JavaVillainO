
public class OperatorEx3 {

	public static void main(String[] args) {
//내림처리
		float pi = 3.141692f;
		
		//소수점 3째자리까지 표현
//		원본값*자릿수/ 되돌릴자릿수 => 자릿수 내림
		float shortPi = (int)(pi*1000)/1000f;
		System.out.println(shortPi);
		
	}

}
