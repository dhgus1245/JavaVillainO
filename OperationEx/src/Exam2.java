
public class Exam2 {

	public static void main(String[] args) {
		
		float pi = 3.141592f;
				//소수점 2째자리까지 표현 3깨자리에서 올림처리
				
		float longPi = (int)(pi*100+0.9)/100f;
		System.out.println(longPi);
	}

}
