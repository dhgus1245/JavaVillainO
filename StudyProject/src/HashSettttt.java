import java.util.*;


public class HashSettttt{

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		HashSet<String> s = new HashSet<String>();
		HashSet<String> m = new HashSet<String>();
		
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
		
		
		s.add("baekjoononlinejudge");
		s.add("startlink");
		s.add("codeplus");
		s.add("sundaycoding");
		s.add("codingsh");
		
		System.out.println(s);
		
		m.add("baekjoon");
		m.add("codeplus");
		m.add("codeminus");
		m.add("startlink");
		m.add("starlink");
		m.add("sundaycoding");
		m.add("codingsh");
		m.add("codinghs");
		m.add("sondaycoding");
		m.add("startrink");
		m.add("icerink");
		
		
		
		int result=0;
		
		Iterator<String> output = s.iterator();
		while(output.hasNext()) {
			String answer= output.next();
			if(m.contains(answer)) {
				result++;
			}
		}

		System.out.println(result);
		
//		=======================================================
				
				
//
//	        Scanner sc = new Scanner(System.in);
//	        int makeSet = sc.nextInt();
//	        int testCase = sc.nextInt();
//	        int result = 0;
//	        sc.nextLine(); //남아있는 개행문자를 제거하기 위해 추가함!
//	        //HashSet을 문자열로 만듭니다.
//	        HashSet<String> hs1 = new HashSet<String>();
//
//	        for(int i = 0 ; i < makeSet; i++) {
//	            hs1.add(sc.nextLine());
//	        }
//	        for(int i = 0 ; i < testCase; i++) {
//	            String get = sc.nextLine();
//	            if(hs1.contains(get)) result++;
//
//	        }
//	        System.out.println(result);
//
//	    }
//	}
		
	}

}
