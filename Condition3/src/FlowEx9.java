import java.util.Random;
import java.util.Scanner;
public class FlowEx9 {
	
	public static void main(String[] args) {
		
		
		int user =0;
		int com =0;
		String changeVal = "";
		String changeVal2 = "";
		
		System.out.println("<가위(1), 바위(2), 보(3) 중 하나를 입력하세요>");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("당신의 선택은 : ");
		user = scan.nextInt();
		com = (int)(Math.random()*3)+1;
		System.out.println("com도 선택했습니다.");
		
		switch(user) {
		case 1: changeVal="가위";break;	
		case 2 :changeVal="바위";break;
		case 3 :changeVal="보";break;
		}
		
		switch(com) {
		case 1: changeVal2="가위";break;	
		case 2 :changeVal2="바위";break;
		case 3 :changeVal2="보"; break;
		}
		
		System.out.println("당신의 선택은 "+changeVal+"입니다.");
		System.out.println("com의 선택은"+changeVal2+"입니다.");
		
		String msgStr = "";
		
		switch(user - com) {
			case 2: case-1:
				System.out.println("당신이 졌습니다.");
				break;
			case 1: case-2 :
				System.out.println("당신이 이겼습니다.");
				break;
			case 0 :
				System.out.println("비겼습니다.");
				break;
		}
		
		
		
	}
}
