package abstractClassesAndMethods;

//abstract can have regular method or abstract method
//Method that do not have body is abstract method
//If a class contains abstract method then the class must be abstract.
abstract class _2Example {
	
	_2Example()
	{
		System.out.println("Constructor of abstract class called");
	}

	protected void regularMethod() {
		System.out.println("Regular method implemented");
	}

	 abstract void abstractMethod();

}
