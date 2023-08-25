package stringPrograms1;

import java.util.HashMap;
import java.util.Map;
//Check the occurence of character in a string
public class Class6 {

	public static void checkOccurence(String s) {
		char[] ch = s.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (char c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}

		}
		System.out.println(map);

	}

	public static void main(String[] args) {
		checkOccurence("Sagar");

	}

}
