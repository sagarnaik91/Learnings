package stringPrograms1;

import java.util.HashMap;
import java.util.Map;
//To check duplicate characters
public class Class3 {

	public void checkDuplicate(String s) {
		Map<Character, Integer> map = new HashMap<>();
		char[] arr = s.toCharArray();
		for (char c : arr) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 2) {
				System.out.println("Duplicate keys are " + entry.getKey());
			}
		}

	}

	public static void main(String[] args) {
		Class3 class3 = new Class3();
		class3.checkDuplicate("Sagar");
	}

}
