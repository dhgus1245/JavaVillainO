import java.util.Scanner;
public class FlowTest5 {
	
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
		char grade = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력해 주세요 : ");
		score = sc.nextInt();
		System.out.println("당신의 점수는 "+score+"입니다");
		
		
		
		if(score<=100 && score>=90) {
			grade ='a';	
		}else if(score>=80) {
			grade = 'b';
		}else if(score>=70) {
			grade = 'c';	
		}else {
			grade = 'f';
		}
		
		//if(score<=100&&score=90)
		//if(score<90&&score<=80)
		//if(score<80&&score<=70)
		
		
		
		
		
		
		System.out.println("당신의 학점은 "+grade+"입니다.");
		
	}
}
