package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class _3Example3 {

	public static void main(String[] args) {
		Map<Integer,String> treemap=new TreeMap<>();
		treemap.put(1, "a");
		treemap.put(2, "b");
		treemap.put(3, "c");
		treemap.put(2, "d");
		System.out.println(treemap);
		
//		Map<Integer,String> hashmap=new HashMap<>(treemap);
//		System.out.println(hashmap);
		Map<Integer,String> hashmap=new HashMap<>();
		hashmap.putAll(treemap);
		System.out.println(hashmap);
		
		String str=hashmap.toString();
		System.out.println("STring str is "+str);
		
	}

}
