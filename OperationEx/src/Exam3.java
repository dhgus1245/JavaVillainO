
public class Exam3 {
	public static void main(String[] args) {
	
	int input = 1;
	String a = "\"������ �׽��ϴ�\"";
	String b = "\"������ �����մϴ�\"";
	String c = "\"�ٽ� �Է����ּ���\"";
//	String d = "";
	
	
//	String ans = (input==1)?a:b;
//	String wer = (input<0||input>1)?c:d;
	
	//���߻��׿�����
	String ans = (input==1)?a:(input==0)?b:c;
	
	
	
	System.out.println("�Է��Ͻ� ���� "+input+" �Դϴ�" );
	System.out.println(ans);
//	System.out.println(wer);
	
	
	
	
	
	
	}
}
