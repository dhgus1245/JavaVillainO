import java.util.Scanner;
public class FlowTest4 {
	
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
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��� �ּ��� : ");
		score = sc.nextInt();
		System.out.println("����� ������ "+score+"�Դϴ�");
		
		if(score >= 90) {
			System.out.println("A�����Դϴ�");
		}else if(score >= 80) {
			System.out.println("B�����Դϴ�");
		}else if(score >= 70) {
			System.out.println("C�����Դϴ�");
		}else {
			System.out.println("F�����Դϴ�");
		}
		
	}
}
