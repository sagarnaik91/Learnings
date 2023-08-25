package Map;

import java.util.HashMap;
import java.util.Map;

public class _2Example {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "Java");
		map.put(2, "C#");
		map.put(3, "Python");
		System.out.println(map);
		for(int a:map.keySet())
		{
			System.out.println(a);
		}
		for(String c:map.values())
		{
			System.out.println(c);
		}
		for(Map.Entry<Integer, String> entry:map.entrySet())
		{
			System.out.println(entry);
		}
	}

}
