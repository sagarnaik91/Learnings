package lambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class StreamAPI {

	public static List places() {
		List<String> plc = new ArrayList<>();
		plc.add("India,Banagalore");
		plc.add("UK,Slough");
		plc.add("US,California");
		return plc;
	}

	public static void main(String[] args) {

		List<String> myplc = places();
		myplc.stream().filter((p) -> p.startsWith("India")).map((p) -> p.toUpperCase()).sorted()
				.forEach((p) -> System.out.println(p));
		myplc.stream().filter((p) -> p.startsWith("India")).forEach((p) -> System.out.println(p));
	}

}
