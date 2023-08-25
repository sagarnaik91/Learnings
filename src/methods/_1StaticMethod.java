package methods;

class _1StaticMethod {

	public static void main(String[] args) {
		int n = addNumbers(2, 2);
		System.out.println(n);

	}

//Method with return type
	 static int addNumbers(int a, int b) {
		int sum = a + b;
		return sum;
	}

}
