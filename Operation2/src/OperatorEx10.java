import java.util.Scanner;
public class OperatorEx10 {

	public static void main(String[] args) {
	int userInput =0;
	//사용자가 입력한 값
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("홀짝판별프로그램 시작");
	String userName = "";
	
	System.out.print("고객님 이름을 입력해 주세요 : ");
	userName = scan.nextLine();
	
	
	System.out.print("숫자를 입력해 주세요 : ");
	userInput =scan.nextInt();
	//임시결과
	int tempNum =0;
	
	
	String result = "";
	
	
	
	
	
	//판별을 위한 과정
	tempNum = userInput%2;
	//사용자가 입력한 값에 대한 홀짝 결과
	//사용자가 입력한 값에 대한 홀짝 판별결과
	result = (tempNum ==0)?"짝수입니다":"홀수입니다";
	System.out.println(userName+"께서 입력한 값은 "+userInput);
	System.out.println(result);
	
	}

}
