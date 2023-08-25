package collection;

import java.util.ArrayList;
import java.util.List;

public class _2ArrayList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		int n=list.get(0);
		System.out.println("Accessed Element:"+ n);
		int m=list.remove(0);
		System.out.println("Removed Element: "+m);
		int o=list.get(0);
		System.out.println("Accessed Element:"+o);

	}

}
