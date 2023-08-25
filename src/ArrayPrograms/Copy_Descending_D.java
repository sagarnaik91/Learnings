package ArrayPrograms;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Copy_Descending_D {

	public static void main(String[] args) {
		Map<String,String> m=new TreeMap<String,String>(Comparator.reverseOrder());
		m.put("Neha", "90");
		m.put("Lilly", "84");
		m.put("Yue Cha", "79");
		System.out.println(m);

	}

}
