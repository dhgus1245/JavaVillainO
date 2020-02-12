import java.util.Scanner;
public class FlowTest3 {
	
	public static void main(String[] args) {
		
		int input = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("값을 입력해 주세요 :");
		input = sc.nextInt();
		
		System.out.println("입력하신 값은 : "+input);
		
		if(input%2==1) {
			System.out.println("홀입니다");
		}else {
			System.out.println("짝입니다");
		}
		/**
		 * 홀짝 판별 프로그램
		 * 
		 */
	}
}
