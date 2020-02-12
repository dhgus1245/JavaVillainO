import java.util.Scanner;
public class FlowEx6 {
	
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
		String grade = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력해 주세요 : ");
		score = sc.nextInt();
		System.out.println("당신의 점수는 "+score+"입니다");
		
		
		
		if(score<=100 && score>=90) {
			grade ="A";	
			if(score>=98) {
				grade += "+";
			}
		}else if(score>=80) {
			grade = "B";
			if(score>=88) {
				grade += "+";
				}
		}else if(score>=70) {
			grade = "C";	
			if(score>=78) {
				grade += "+";
			}
		}else {
			grade = "F";
		}
		
		//if(score<=100&&score=90)
		//if(score<90&&score<=80)
		//if(score<80&&score<=70)
		
		
		
		System.out.println("당신의 학점은 "+grade+"입니다.");
		
	}
}
