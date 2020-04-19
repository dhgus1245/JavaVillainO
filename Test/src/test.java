import java.util.ArrayList;

public class test {
	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		
		for(int i =0; i<9; i++) {
			list1.add(i+1);
		}
		
		for(int i =0; i<2; i++) {
			list2.add(i+2);
		}

		
		
		for(int i =0; i<9; i++) {
			for(int j =0; j<2; j++) {
				int mul =(int)list1.get(i)*(int)list2.get(j);
				System.out.print((int)list1.get(i)+"*"+(int)list2.get(j)+" = "+mul+"  \t");
			}
			System.out.println();
		}
		
		
	}
}
