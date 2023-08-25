package stringPrograms1;

//check if string is a palindrome
public class Class8 {

	public static boolean checkPalindrome(String s1) {
		s1=s1.toLowerCase();
		String s2 = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			s2 = s2 + s1.charAt(i);
		}
		System.out.println(s2);
		boolean y = s1.equals(s2);
		return y;
	}

	public static void main(String[] args) {

		System.out.println("Is it boolean " + checkPalindrome("Gadag"));
	}

}
