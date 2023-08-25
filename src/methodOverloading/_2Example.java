package methodOverloading;

public class _2Example {

	private static void display(int a) {
		System.out.println("Got integer data");
	}

	private static void display(String a) {
		System.out.println("Got string data");
	}
	
	public static void main(String[] args)
	{
		//display(7);
		display("Hello");
	}
}
