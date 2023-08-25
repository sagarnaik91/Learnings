package collection;

import java.util.ArrayList;
import java.util.Arrays;

public class _5ArrayToArrayList {

	public static void main(String[] args) {
		String[] arr=new String[] {"abc","vcd","fde"};
		for(String item:arr)
		{
			System.out.println(item);
		}

		ArrayList<String> list=new ArrayList<>(Arrays.asList(arr));
		System.out.println(list);
		
	}

}
