package constructor;

public class _5ConstructorOverloading {

	String a;

	_5ConstructorOverloading() {
		this.a = "Java";
		System.out.println("Language is " + a);
	}

	_5ConstructorOverloading(String a) {
		this.a = a;
		System.out.println("Langauge is " + a);
	}

	void getName() {
		System.out.println("Method Language is "+this.a);
	}

	public static void main(String[] args) {

		_5ConstructorOverloading obj1 = new _5ConstructorOverloading();
		_5ConstructorOverloading obj2 = new _5ConstructorOverloading("C#");
		obj1.getName();
		obj2.getName();

	}

}
