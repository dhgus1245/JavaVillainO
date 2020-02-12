
public class Exam3 {
	public static void main(String[] args) {
	
	int input = 1;
	String a = "\"전원을 켰습니다\"";
	String b = "\"전원을 종료합니다\"";
	String c = "\"다시 입력해주세요\"";
//	String d = "";
	
	
//	String ans = (input==1)?a:b;
//	String wer = (input<0||input>1)?c:d;
	
	//다중삼항연산자
	String ans = (input==1)?a:(input==0)?b:c;
	
	
	
	System.out.println("입력하신 값은 "+input+" 입니다" );
	System.out.println(ans);
//	System.out.println(wer);
	
	
	
	
	
	
	}
}
