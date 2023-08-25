package set;

import java.util.HashSet;
import java.util.Set;

public class _1Example {

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);

		Set<Integer> set2 = new HashSet();
		set2.add(1);
		set2.add(2);
		set2.add(6);

		// set1.addAll(set2);
		// System.out.println("Union is "+set1);
		// set1.retainAll(set2);
		// System.out.println("Intersection is " + set1);
		boolean y=set1.containsAll(set2);
		System.out.println(y);

	}

}
