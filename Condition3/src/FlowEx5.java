import java.util.Scanner;
public class FlowEx5 {

	public static void main(String[] args) {
		
		
//		if else문
//		
//		if(조건식) {
//			조건식이 true일 때 수행될 문장들을 적는다	
//		}else if(조건식2){
//			조건식2의 결과가 true일 때 수행될 문장들을 적는다
//		}else if(조건식3){
//			조건식3의 결과가 true일 때 수행될 문장들을 적는다
//		}else{
//		위의 어느 조건식도 만족하지 않을 대 수행될 문장들을 적는다
//		}
//		
		int code = 0;
		
		System.out.println("1 시작\t 2 수행\t 3 실행\t 4 종료");
		System.out.print("코드를 입력해 주세요 : ");
		Scanner sc = new Scanner(System.in);
		code = sc.nextInt();
		
		if(code==1) {
			System.out.println("시작");
		}else if(code == 2) {
			System.out.println("수행");
		}else if(code == 3) {
			System.out.println("정지");
		}else {
			System.out.println("종료");
		}
		
		
		

	}

}
