import java.util.*;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Iterator;


public class TreeSetTest {
	public static void main(String[] args) {
		
		Set<Integer> set = new TreeSet<Integer>();

		set.add(4); // 데이터 추가
		set.add(2);
		set.add(1);
		set.add(3);
		set.add(1);
		set.add(3);


		Iterator<Integer> it = set.iterator(); // 반복자 생성

		while (it.hasNext()) {
			System.out.println(it.next());
		}


		Set<String> seta = new LinkedHashSet<String>();
		
		seta.add("1");
		seta.add("1");
		seta.add("two");
		seta.add("3");
		seta.add("4");
		seta.add("five");
		

		Iterator<String> ita = seta.iterator();
		while (ita.hasNext()) {
			System.out.println(ita.next());
		}
		






	}
}
