package thisKeyword;

public class _3Example_PassingThisAsArgument {
	int a;
	int b;

	_3Example_PassingThisAsArgument(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println(this.a + " and " + this.b);
		add(this);
		System.out.println(this.a + " and " + this.b);
	}

	void add(_3Example_PassingThisAsArgument o) {
		o.a = a + b;
		o.b = a - b;

	}

	public static void main(String[] args) {
		_3Example_PassingThisAsArgument ex = new _3Example_PassingThisAsArgument(2, 3);
	}
}
