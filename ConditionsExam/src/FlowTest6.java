import java.util.Scanner;
public class FlowTest6 {
	
	public static void main(String[] args) {
		
		int month =0 ;
		
		
		Scanner sc = new Scanner(System.in);
			
		System.out.print("달을 입력해주세요 : ");
		month = sc.nextInt();
		
		String m="";
		if(month>=3 && month<=5)m="봄";
		else if(month>=6&&month<=8)m="여름";
		else if(month>=9&&month<=11)m="가을";
		else if(month==1||month==2||month==12)m="겨울";
		else {
			System.out.println("값이 잘못되었습니다.");
		}
		
		System.out.println(month+"는 "+m+"입니다.");
			
			
			
		System.out.println("입력된 달 : "+month);
		
		switch(month) {
			case 1 :
				System.out.println(month+"월은 겨울입니다");
				break;
			case 2 : 
				System.out.println(month+"월은 겨울입니다");
				break;
			case 3 : 
				System.out.println(month+"월은 봄입니다");
				break;
			case 4 : 
				System.out.println(month+"월은 봄입니다");
				break;
			case 5 : 
				System.out.println(month+"월은 봄입니다");
				break;
			case 6 : 
				System.out.println(month+"월은 여름입니다");
				break;
			case 7 : 
				System.out.println(month+"월은 여름입니다");
				break;
			case 8 : 
				System.out.println(month+"월은 여름입니다");
				break;
			case 9: 
				System.out.println(month+"월은 가을입니다");
				break;
			case 10 : 
				System.out.println(month+"월은 가을입니다");
				break;
			case 11: 
				System.out.println(month+"월은 가을입니다");
				break;
			case 12 : 
				System.out.println(month+"월은 겨울입니다");
				break;
			default :
				System.out.println("입력값이 잘못되었습니다.");
		}
		
	}
}
