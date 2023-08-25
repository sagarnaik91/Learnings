package methods;

class _1StaticMethod2 {
	static int sum;

	public static void main(String[] args) {
		_1StaticMethod2 ex = new _1StaticMethod2();
		int n = ex.addNumbers(5, 2);
		System.out.println(n);

	}

//Method with return type
	int addNumbers(int a, int b) {
		_1StaticMethod2.sum = a + b;
		return sum;
	}

}
