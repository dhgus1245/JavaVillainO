import java.util.Scanner;
public class FlowTest7 {
	
	public static void main(String[] args) {
		
		
		int diceNum = (int)(Math.random()*6)+1;
		System.out.println("주사위를 굴립니다");
		System.out.println("나온 수 :"+diceNum);
		
		
		
		switch(diceNum) {
			case 1 :
				System.out.println("한 칸 전진하세요");
				break;
			case 2 : 
				System.out.println("두 칸 전진하세요");
				break;
			case 3 : 
				System.out.println("세 칸 전진하세요");
				break;
			case 4 : 
				System.out.println("한 칸 뒤로가세요");
				break;
			case 5 : 
				System.out.println("두 칸 뒤로가세요");
				break;
			default :
				System.out.println("움직일 수 없습니다.");
		}
		
	}
}
