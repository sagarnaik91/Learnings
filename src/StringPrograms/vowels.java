package StringPrograms;

public class vowels {

	public static void main(String[] args) {
		String s = "Automation Testing String";
		vowelcheck(s);
		reverse(s);
	}

	public static void vowelcheck(String s) {
		int count = 0;
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				count++;
				System.out.println(s.charAt(i));
			}
		}
		System.out.println(count);
	}

	public static void reverse(String s) {

		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
	}

}
