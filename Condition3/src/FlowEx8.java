import java.util.Scanner;
public class FlowEx8 {
	
	public static void main(String[] args) {
		
		
		int score = (int)(Math.random()*10)+1;
								//		����	������
									//  �� ������ 10���� ���� ���;��� ������ 10�ΰ��̴�
		score =score*100;
		
		switch(score) {
			case 100 :
				System.out.println("����� ������ 100�̰�, ��ǰ�� �������Դϴ�.");
				break;
			case 200 : 
				System.out.println("����� ������ 200�̰�, ��ǰ�� ��Ʈ���Դϴ�.");
				break;
			case 300 : 
				System.out.println("����� ������ 300�̰�, ��ǰ�� �ڵ����Դϴ�.");
				break;
			default :
				System.out.println("�˼������� ����� ������ �ش��ǰ�� �����ϴ�.");
		}
		
		
		
	}
}
