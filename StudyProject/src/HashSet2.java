import java.util.*;

public class HashSet2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		sc.nextLine();
		HashSet<String> hs1 = new HashSet<>();
		HashSet<String> allSet = new HashSet<>();
		
		//allSet에서는 1~20까지의 숫자 입력
		for (int i = 1; i <= 20; i++) {
			allSet.add(i + "");
		}

		for (int i = 0; i < testCase; i++) {
			String str = sc.next();//next는 단어만 받는다
			switch (str) {
			case "add":
				hs1.add(sc.next());
				break;
			case "remove":
				hs1.remove(sc.next());
				break;
			case "check":
				if (hs1.contains(sc.next()))
					System.out.println("1");
				else
					System.out.println("0");
				break;
			case "toggle":
				String toggleStr = sc.next();
				if (hs1.contains(toggleStr))
					hs1.remove(toggleStr);
				else
					hs1.add(toggleStr);
				break;
			case "all":
				hs1.clear();
				hs1 = (HashSet) allSet.clone();
				break;
			case "empty":
				hs1.clear();
				break;
			}
		}

	}

}
