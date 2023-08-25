package stringPrograms1;
//Reverse a string
public class Class5 {

	public static String reverseString(String s1) {
		String s2 = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			s2 = s2 + s1.charAt(i);

		}
		return s2;

	}

	public static void main(String[] args) {
		System.out.println(reverseString("Mumbai"));
	}

}
