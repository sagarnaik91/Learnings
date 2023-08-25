package abstractClassesAndMethods;

/**
 * If we want to use the abstract method of super class in sub class then we
 * have to define the abstract method in subclass else it will throw compile error. If
 * we dont want to define the abstract method in sub class then we have to make
 * subclass as abstract.
 **/
public class _4Example {

	public static void main(String[] args) {
		_3ExampleAsubClassOf_2Example2 c = new _3ExampleAsubClassOf_2Example2();
		c.abstractMethod();
		c.regularMethod();

	}

}
