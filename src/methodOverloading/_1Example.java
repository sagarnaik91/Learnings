package methodOverloading;

/**
 * Method overloading is achieved by having 2 or more methods of same name but
 * different number arguments or different datatype of arguments
 **/
public class _1Example {

	public static void main(String[] args) {

		System.out.println("Argument is " + display(3));
		display(4, 5);
	}

	public static int display(int a) {
		return a;
	}

	private static void display(int a, int b) {
		System.out.println("Argument is " + a + " and " + b);

	}
}
