import java.util.Scanner;
public class OperatorEx10 {

	public static void main(String[] args) {
	int userInput =0;
	//����ڰ� �Է��� ��
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Ȧ¦�Ǻ����α׷� ����");
	String userName = "";
	
	System.out.print("���� �̸��� �Է��� �ּ��� : ");
	userName = scan.nextLine();
	
	
	System.out.print("���ڸ� �Է��� �ּ��� : ");
	userInput =scan.nextInt();
	//�ӽð��
	int tempNum =0;
	
	
	String result = "";
	
	
	
	
	
	//�Ǻ��� ���� ����
	tempNum = userInput%2;
	//����ڰ� �Է��� ���� ���� Ȧ¦ ���
	//����ڰ� �Է��� ���� ���� Ȧ¦ �Ǻ����
	result = (tempNum ==0)?"¦���Դϴ�":"Ȧ���Դϴ�";
	System.out.println(userName+"���� �Է��� ���� "+userInput);
	System.out.println(result);
	
	}

}
