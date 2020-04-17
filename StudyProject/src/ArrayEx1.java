import java.util.Scanner;
import java.util.Arrays;
public class ArrayEx1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String[] array = new String[10];
		
		int count = 0;
		int countArr = 0; 
		
		while(count<10) {
			System.out.print(count+1+"번째 값을 입력해 주세요 : ");
			String inputStr = scan.nextLine();
			
			array[count]=inputStr;
			
			if(inputStr.length()==0) {
				countArr = count;
				break;
			}
			
			if(inputStr.length()<=15) {
				count++;
			}
		}
		
		//Arrays.sort(array);이것을 사용하면 null값의 중복은 정렬이 안되기대문에 오류가뜬다
		//다른 array를 사용하여 null을 제외한 값을 받는다
		
		String[] array2 = new String[countArr];
		
		for (int i = 0; i < array2.length; i++) {
			array2[i]=array[i];
		}
		
		Arrays.sort(array2);
		System.out.println(Arrays.toString(array2));


	}
}
