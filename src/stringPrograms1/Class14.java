package stringPrograms1;
//reverse the characters in word of sentence
public class Class14 {

	public static String reverseWordsFromString(String inputString) {

		String[] wordsArray = inputString.trim().split("\\s+");
		String stringWithReversedWords = "";

		for (String word : wordsArray) {

			stringWithReversedWords += reverseWord(word) + " ";

		}
		return stringWithReversedWords.trim();

	}

	public static String reverseWord(String word) {
		String reversedWord = "";

		for (int i = word.length() - 1; i >= 0; i--) {
			reversedWord += word.charAt(i);

		}
		return reversedWord;
	}

	public static void main(String[] args) {

		String inputString = "Arise! Awake! and stop not until the goal is reached";

		String outputString = reverseWordsFromString(inputString);

		System.out.println("The string with the reversed word is : \n" + outputString);

	}

}
