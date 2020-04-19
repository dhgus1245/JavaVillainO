import java.util.Scanner;
import java.util.Arrays;

public class ArrayEx2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String inputStr=scan.nextLine();
		
		
		char[][] array = new char[inputStr.length()][2];
		
		for (int i = 0; i < inputStr.length(); i++) {//2차배열중 앞자리 입력
			array[i][0] = inputStr.charAt(i);
		}
		
		System.out.println("존재하는 char");//단어를 나눔
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i][0]+", ");
		}
		System.out.println();
		System.out.println("=============정렬================");
		
		for (int i = 0; i < array.length; i++) {//2차배열 중 뒷자리(갯수)입력
			int count =0;
			for (int j = 0; j < array.length; j++) {
				char a =array[i][0];
				char b = array[j][0];
				if(a==b) {
					count++;
				}
			}
			char c = Character.forDigit(count, 10);
			array[i][1]= c;
		}
		
		for (int i = 0; i < array.length; i++) {//중복값 변환
			
			char a =array[i][0];
			for (int j = i+1; j < array.length; j++) {
				char b = array[j][0];
				if(a==b) {
					array[j][0]='.';
				}
			}
			
			
			if (array[i][0]!='.') {//결과값 출력
				for (int j = 0; j < array[i].length; j++) {
					System.out.print(array[i][j]);	
			}
			System.out.println();
			}	
		}	
	}
}
