import java.util.Scanner;
public class FlowTest4 {
	
	public static void main(String[] args) {
		/**
		 * 성적 처리프로그램
		 * 90점 이상 : a
		 * 80점 이상 : b
		 * 70점 이상 : c
		 * 그 밑은 f
		 * 
		 */
		int score = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력해 주세요 : ");
		score = sc.nextInt();
		System.out.println("당신의 점수는 "+score+"입니다");
		
		if(score >= 90) {
			System.out.println("A학점입니다");
		}else if(score >= 80) {
			System.out.println("B학점입니다");
		}else if(score >= 70) {
			System.out.println("C학점입니다");
		}else {
			System.out.println("F학점입니다");
		}
		
	}
}
