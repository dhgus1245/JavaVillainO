
public class OperatorEx7 {

	public static void main(String[] args) {
		
// 삼항연산자
int x = 10;
int y = -10;
int absX =0;
int absY =0;

//(조건식) ? 식1 : 식2
absX =(x>=0)?x:-x;
absY =(y>=0)?y:-y;

System.out.println("x의 절대값은 "+ absX);
System.out.println("Y의 절대값은 "+ absY);

String str = "";
str = "문자열 굿";
System.out.println(str);

//다중 삼항연산자
//(조건식1)? 식1 :(조건식2)? 식2 : 식 3;


	}

}
