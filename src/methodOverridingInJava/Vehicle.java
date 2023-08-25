package methodOverridingInJava;

public class Vehicle {

	protected static String name;

	public void features() {
		System.out.println("X1 has medium space");
	}
	
	protected static void testDrive()
	{
		System.out.println("Test drive done");
	}
}
