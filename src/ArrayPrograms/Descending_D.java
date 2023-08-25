package ArrayPrograms;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Descending_D {

	public static void main(String[] args) {
		Map<String,String> h=new TreeMap<String,String>(Comparator.reverseOrder());
		h.put("Neha", "90");
		h.put("Lilly", "84");
		h.put("Yue Cha", "79");
		h.put("Anna", "85");
		System.out.println(h);
		

	}

}
