import java.util.Random;
import java.util.Scanner;
public class FlowEx9 {
	
	public static void main(String[] args) {
		
		
		int user =0;
		int com =0;
		String changeVal = "";
		String changeVal2 = "";
		
		System.out.println("<����(1), ����(2), ��(3) �� �ϳ��� �Է��ϼ���>");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("����� ������ : ");
		user = scan.nextInt();
		com = (int)(Math.random()*3)+1;
		System.out.println("com�� �����߽��ϴ�.");
		
		switch(user) {
		case 1: changeVal="����";break;	
		case 2 :changeVal="����";break;
		case 3 :changeVal="��";break;
		}
		
		switch(com) {
		case 1: changeVal2="����";break;	
		case 2 :changeVal2="����";break;
		case 3 :changeVal2="��"; break;
		}
		
		System.out.println("����� ������ "+changeVal+"�Դϴ�.");
		System.out.println("com�� ������"+changeVal2+"�Դϴ�.");
		
		String msgStr = "";
		
		switch(user - com) {
			case 2: case-1:
				System.out.println("����� �����ϴ�.");
				break;
			case 1: case-2 :
				System.out.println("����� �̰���ϴ�.");
				break;
			case 0 :
				System.out.println("�����ϴ�.");
				break;
		}
		
		
		
	}
}
