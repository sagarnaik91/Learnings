package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _2Example {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("abc");
		set.add("dew");
		set.add("vdw");
		System.out.println(set);
		
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
