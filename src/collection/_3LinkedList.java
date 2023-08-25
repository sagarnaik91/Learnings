package collection;

import java.util.LinkedList;
import java.util.List;

public class _3LinkedList {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		int a = list.get(0);
		System.out.println(a);
		int b = list.indexOf(0);
		System.out.println(b);
		int c = list.remove(0);
		System.out.println(c);
		list.set(1, 11);
		int d=list.get(0);
		System.out.println(list);
		
		for(int e:list)
		{
			System.out.println(e);
		}
	}

}
