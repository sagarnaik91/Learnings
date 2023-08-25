package interfaceKeyword;

public class _10Main implements _8Animal, _9Deer {

	public void type(String a) {
		System.out.println(a+" type method called");
	}

	public void area(String a) {
		System.out.println(a+" area method called");
	}

	public static void main(String[] args) {
		_10Main ex = new _10Main();
		ex.type("Animal");
		ex.area("Deer");
	}

}
