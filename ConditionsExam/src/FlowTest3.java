import java.util.Scanner;
public class FlowTest3 {
	
	public static void main(String[] args) {
		
		int input = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է��� �ּ��� :");
		input = sc.nextInt();
		
		System.out.println("�Է��Ͻ� ���� : "+input);
		
		if(input%2==1) {
			System.out.println("Ȧ�Դϴ�");
		}else {
			System.out.println("¦�Դϴ�");
		}
		/**
		 * Ȧ¦ �Ǻ� ���α׷�
		 * 
		 */
	}
}
