package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _3Example {
	

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		System.out.println("Set1 size " + set1.size());

		Set<Integer> set2 = new HashSet<>();
		set2.addAll(set1);
		// set2.remove(3);
		// set2.removeAll(set1);
		System.out.println(set2);

		// Accessing hashset elements

		Iterator<Integer> itr = set2.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		Object[] arr=set2.toArray();
		for(Object a:arr)
		{
			if(a.equals(3))
			{
				System.out.println(a);
			}
		}
	}

}
