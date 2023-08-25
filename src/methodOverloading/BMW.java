package methodOverloading;

import methodOverridingInJava.Vehicle;

public class BMW extends Vehicle {
	/**
	 * In inheritance, we can inherit members(variable,methods) in subclass
	 * irrespective of static or non static
	 **/
	/**
	 * Protected members cannot be used in class outside package, but protected
	 * members can be inherited to subclass outside package
	 **/
	/** Method overriding is not possible in case of static method **/
	/** super keyword is not possible in case of static method **/
	public void features() {
		/**
		 * super keyword is used to execute the method from super class in case of
		 * method overriding
		 **/
		super.features();
		System.out.println(Vehicle.name + " has bigger space");
		Vehicle.testDrive();
		Vehicle.name = "xyz";

	}

}
