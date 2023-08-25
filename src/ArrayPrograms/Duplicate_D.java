package ArrayPrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Duplicate_D {

	public static void main(String[] args) {
		String s1 = "Automation testing String";
		String s2 = "String Testing proggramm";
		duplicateCheck(s1);
		duplicateCheck(s2);
		desc(s1);
		desc(s2);
	}

	public static void duplicateCheck(String s) {
		char[] chararray = s.toCharArray();
		Map<Character, Integer> h = new HashMap<Character, Integer>();
		for (char c : chararray) {
			if (h.containsKey(c)) {
				h.put(c, h.get(c) + 1);
			} else {
				h.put(c, 1);
			}
		}
		// System.out.println(h);
		for (Map.Entry<Character, Integer> entry : h.entrySet()) {
			if (entry.getValue() == 2) {
				System.out.println(entry.getKey() + " " + entry.getValue());
			}
		}
		System.out.println(h);
	}

	public static void desc(String s) {
		char[] charArray = s.toCharArray();
		Arrays.sort(charArray);
		System.out.println(String.valueOf(charArray));

	}
}
