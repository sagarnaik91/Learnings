package collection;

import java.util.ArrayList;
import java.util.List;

public class _4ConvertArrayListToArray {

	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("abc");
		list.add("cvf");
		list.add("cds");
		System.out.println(list);

		String[] arr = new String[list.size()];
		list.toArray(arr);
		System.out.println(arr);
		for(String item:arr)
		{
			System.out.println(item);
		}
	}

}
