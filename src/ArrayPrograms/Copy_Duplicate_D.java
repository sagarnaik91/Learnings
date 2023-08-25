package ArrayPrograms;

import java.util.HashMap;
import java.util.Map;

public class Copy_Duplicate_D {

	public static void main(String[] args) {
		String s1 = "Automation testing String";
		String s2 = "String Testing proggramm";
		checkDuplicate(s1);
		checkDuplicate(s2);
	}

	public static void checkDuplicate(String s) {
		char[] chararray = s.toCharArray();
		HashMap<Character, Integer> h = new HashMap<Character, Integer>();
		{
			for (char c : chararray) {
				if (h.containsKey(c)) {
					h.put(c, h.get(c) + 1);
				}
				else
				{
					h.put(c, 1);
				}
			}
		}
		//System.out.println(h);
		
		for(Map.Entry<Character, Integer> entry : h.entrySet())
		{
			if(entry.getValue()==2)
			{
				System.out.println(entry.getKey()+" "+ entry.getValue());;
			}
		}
		
	

	}

}
