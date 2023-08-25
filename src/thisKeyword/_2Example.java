package thisKeyword;

public class _2Example {

	int a;
	int b;

	_2Example(int i, int j) {
		this.a = i;
		this.b = j;
	}

	_2Example(int i) {
		this(i, i);
	}

	_2Example() {
		this(1);
	}

	@Override
	public String toString() {
		return this.a + " + " + this.b + "i";
	}

	public static void main(String[] args) {
		_2Example c1 = new _2Example(1, 2);
		_2Example c2 = new _2Example(2);
		_2Example c3 = new _2Example();
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}

}
