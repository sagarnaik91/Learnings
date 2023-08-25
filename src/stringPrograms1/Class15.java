package stringPrograms1;
//reverse the characters in word of sentence
public class Class15 {

	public static String reverseWord(String s1) {
		String[] s2 = s1.split("\\W+");
		String reverseword = "";
		for (String word : s2) {
			reverseword = reverseword + wordMethod(word)+" ";
		}
		return reverseword;
	}

	public static String wordMethod(String word) {
		String a = "";
		for (int i = 0; i < word.length(); i++) {
			a = "" + word.charAt(i) + a;
		}
		return a;
	}

	public static void main(String[] args) {
		System.out.println(reverseWord("My name is Sagar"));

	}

}
