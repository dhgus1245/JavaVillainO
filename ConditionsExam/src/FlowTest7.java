import java.util.Scanner;
public class FlowTest7 {
	
	public static void main(String[] args) {
		
		
		int diceNum = (int)(Math.random()*6)+1;
		System.out.println("�ֻ����� �����ϴ�");
		System.out.println("���� �� :"+diceNum);
		
		
		
		switch(diceNum) {
			case 1 :
				System.out.println("�� ĭ �����ϼ���");
				break;
			case 2 : 
				System.out.println("�� ĭ �����ϼ���");
				break;
			case 3 : 
				System.out.println("�� ĭ �����ϼ���");
				break;
			case 4 : 
				System.out.println("�� ĭ �ڷΰ�����");
				break;
			case 5 : 
				System.out.println("�� ĭ �ڷΰ�����");
				break;
			default :
				System.out.println("������ �� �����ϴ�.");
		}
		
	}
}
