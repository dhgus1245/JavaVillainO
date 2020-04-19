import java.util.ArrayList;
import java.util.List;

public class Test3 {
	public static void main(String[] args) {
		
		List strList = new ArrayList();
		
		strList.add("첫번째");
		strList.add("두번째");
		strList.add("세번째");
		strList.add("네번째");
		
		int num = strList.size();
		
		for(int i =0; i<num; i++) {
			
			viewList(strList);
				
			strList.remove(i);
				
		}
		
		
		
	}
	
	public static void viewList(List strList) {
		String str = "";
		
		for(int i = 0; i<strList.size(); i++) {
			str = (String)strList.get(i);
			System.out.println(i+" : "+str);
		}
		System.out.println();
		
	}
	
}
