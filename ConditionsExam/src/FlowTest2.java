public class FlowTest2 {
	
	public static void main(String[] args) {
		
		
		int input = 0;
		
		input=25555;
		
		String on = "������ �׽��ϴ�";
		String off = "������ �����մϴ�";
		

		System.out.println("�Է��Ͻ� ���� : "+input);
		
		
		if(input==0) {
			System.out.println(on);
		}else {
			System.out.println(off);
		}
		
		
		String a = (input==1)?"a":(input==2)?"b":"c";
		System.out.println(a);
	}
}
