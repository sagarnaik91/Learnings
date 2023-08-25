package stringPrograms1;
//Program to check if two strings are equal
public class Class1 {

	public static void main(String[] args) {
		String s1="My name is Sagar Naik";
		String s2="my name is sagar naik";
		System.out.println("Checking using equals method "+s1.equals(s2));
		System.out.println("Checking using equalsIgnoreCase "+ s1.equalsIgnoreCase(s2));

	}

}
