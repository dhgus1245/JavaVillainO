import java.util.Scanner;
public class FlowEx6 {
	
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
		String grade = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��� �ּ��� : ");
		score = sc.nextInt();
		System.out.println("����� ������ "+score+"�Դϴ�");
		
		
		
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
		
		
		
		System.out.println("����� ������ "+grade+"�Դϴ�.");
		
	}
}
