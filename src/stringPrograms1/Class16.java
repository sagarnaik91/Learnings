package stringPrograms1;

public class Class16 {

	public static void main(String[] args) {
		String firstString="Sagar";
		String secondString="Naik";
		firstString=firstString+secondString;
		secondString=firstString.substring(0,firstString.length()-secondString.length());
		System.out.println(secondString);
		firstString=firstString.substring(secondString.length());
		System.out.println(firstString);

	}

}
