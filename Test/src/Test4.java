import java.util.ArrayList;
import java.util.List;

public class Test4 {
	public static void main(String[] args) {
		
		List strList = new ArrayList();
		
		strList.add("첫번째");
		strList.add("두번째");
		strList.add("세번째");
		strList.add("네번째");
			
			viewList(strList);
				
			removeList(strList);
			
			System.out.println("왕창 다지웠따");
			viewList(strList);
			
		
				
	
	}
	
	public static void removeList(List strList) {
		for(int i =strList.size()-1; i>=0 ; i--) {
			System.out.println(strList.size());
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
