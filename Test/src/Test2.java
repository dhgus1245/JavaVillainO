import java.util.Scanner;
import java.util.ArrayList;

public class Test2 {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i =0; i<2; i++) {
			System.out.println("입력 : ");
			list.add(sc.nextInt()); 
		}
		
		System.out.println("합한 값 : "+((int)list.get(0)+(int)list.get(1)));		
		
	}
}


