import java.util.Scanner;
public class FlowEx5 {

	public static void main(String[] args) {
		
		
//		if else��
//		
//		if(���ǽ�) {
//			���ǽ��� true�� �� ����� ������� ���´�	
//		}else if(���ǽ�2){
//			���ǽ�2�� ����� true�� �� ����� ������� ���´�
//		}else if(���ǽ�3){
//			���ǽ�3�� ����� true�� �� ����� ������� ���´�
//		}else{
//		���� ��� ���ǽĵ� �������� ���� �� ����� ������� ���´�
//		}
//		
		int code = 0;
		
		System.out.println("1 ����\t 2 ����\t 3 ����\t 4 ����");
		System.out.print("�ڵ带 �Է��� �ּ��� : ");
		Scanner sc = new Scanner(System.in);
		code = sc.nextInt();
		
		if(code==1) {
			System.out.println("����");
		}else if(code == 2) {
			System.out.println("����");
		}else if(code == 3) {
			System.out.println("����");
		}else {
			System.out.println("����");
		}
		
		
		

	}

}
