package stringPrograms1;

import java.util.HashMap;
import java.util.Map;

public class Class11 {

	public static void main(String[] args) {
		Map<String, Integer> map1 = new HashMap<>();
		Map<Integer, String> map2 = new HashMap<>();
		map1.put("a", 1);
		map1.put("b", 2);
		map1.put("c", 3);

		for (Map.Entry<String, Integer> entry : map1.entrySet()) {
			map2.put(entry.getValue(), entry.getKey());
		}
		System.out.println(map1);
		System.out.println(map2);

	}

}
