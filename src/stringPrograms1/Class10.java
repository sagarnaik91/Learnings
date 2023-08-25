package stringPrograms1;

import java.util.HashMap;
import java.util.Map;

//Duplicate string in a sentence
public class Class10 {

	public static void main(String[] args) {
		String s = "My name is Sagar";
		String[] arr = s.split("\\s+");
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String s2 : arr) {
			if (map.containsKey(s2)) {
				map.put(s2, map.get(s2) + 1);
			} else {
				map.put(s2, 1);
			}
		}
		System.out.println(map);

	}

}
