import java.util.Scanner;
public class FlowTest5 {
	
	public static void main(String[] args) {
		/**
		 * ���� ó�����α׷�
		 * 90�� �̻� : a
		 * 80�� �̻� : b
		 * 70�� �̻� : c
		 * �� ���� f
		 * 
		 */
		int score = 0;
		char grade = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��� �ּ��� : ");
		score = sc.nextInt();
		System.out.println("����� ������ "+score+"�Դϴ�");
		
		
		
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
		
		
		
		
		
		
		System.out.println("����� ������ "+grade+"�Դϴ�.");
		
	}
}
