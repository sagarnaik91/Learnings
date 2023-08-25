package stringPrograms1;

import java.util.Arrays;

//check if two strings are anagram
public class Class4 {

	public static boolean isAnagram(String s1, String s2) {
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		boolean y = Arrays.equals(ch1, ch2);
		return y;
	}

	public static void main(String[] args) {
		boolean y = isAnagram("Karwar", "Karwar");
		System.out.println("Is it anagram " + y);

	}
}
