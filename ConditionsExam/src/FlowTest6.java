import java.util.Scanner;
public class FlowTest6 {
	
	public static void main(String[] args) {
		
		int month =0 ;
		
		
		Scanner sc = new Scanner(System.in);
			
		System.out.print("���� �Է����ּ��� : ");
		month = sc.nextInt();
		
		String m="";
		if(month>=3 && month<=5)m="��";
		else if(month>=6&&month<=8)m="����";
		else if(month>=9&&month<=11)m="����";
		else if(month==1||month==2||month==12)m="�ܿ�";
		else {
			System.out.println("���� �߸��Ǿ����ϴ�.");
		}
		
		System.out.println(month+"�� "+m+"�Դϴ�.");
			
			
			
		System.out.println("�Էµ� �� : "+month);
		
		switch(month) {
			case 1 :
				System.out.println(month+"���� �ܿ��Դϴ�");
				break;
			case 2 : 
				System.out.println(month+"���� �ܿ��Դϴ�");
				break;
			case 3 : 
				System.out.println(month+"���� ���Դϴ�");
				break;
			case 4 : 
				System.out.println(month+"���� ���Դϴ�");
				break;
			case 5 : 
				System.out.println(month+"���� ���Դϴ�");
				break;
			case 6 : 
				System.out.println(month+"���� �����Դϴ�");
				break;
			case 7 : 
				System.out.println(month+"���� �����Դϴ�");
				break;
			case 8 : 
				System.out.println(month+"���� �����Դϴ�");
				break;
			case 9: 
				System.out.println(month+"���� �����Դϴ�");
				break;
			case 10 : 
				System.out.println(month+"���� �����Դϴ�");
				break;
			case 11: 
				System.out.println(month+"���� �����Դϴ�");
				break;
			case 12 : 
				System.out.println(month+"���� �ܿ��Դϴ�");
				break;
			default :
				System.out.println("�Է°��� �߸��Ǿ����ϴ�.");
		}
		
	}
}
