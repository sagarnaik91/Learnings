package stringPrograms1;

import java.util.HashMap;
import java.util.Map;
//to check duplicate characters
public class Class2 {

	public static void main(String[] args) {
		String s = "Automationtesting";

		Map<Character, Integer> map = new HashMap<>();
		char[] arr = s.toCharArray();
		for (char a : arr) {
			if (map.containsKey(a)) {
				map.put(a, map.get(a)+1);
			}
			else
			{
				map.put(a, 1);
			}
		}
		System.out.println(map);
		
		for(Map.Entry<Character, Integer> entry:map.entrySet())
		{
			if(entry.getValue()==2)
			{
				System.out.println("Duplicate keys are "+entry.getKey());
			}
		}

	}

}
