package constructor;

public class _1Example {
	private String name;

	_1Example() {
		System.out.println("Constructor called");
		name = "Java is easy";
	}

	public static void main(String[] args) {
		_1Example ex = new _1Example();
		System.out.println("Main method called and name is " + ex.name);
	}

}
