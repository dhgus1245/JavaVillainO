public class FlowTest2 {
	
	public static void main(String[] args) {
		
		
		int input = 0;
		
		input=25555;
		
		String on = "전원을 켰습니다";
		String off = "전원을 종료합니다";
		

		System.out.println("입력하신 값은 : "+input);
		
		
		if(input==0) {
			System.out.println(on);
		}else {
			System.out.println(off);
		}
		
		
		String a = (input==1)?"a":(input==2)?"b":"c";
		System.out.println(a);
	}
}
