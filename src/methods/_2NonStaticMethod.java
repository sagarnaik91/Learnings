package methods;

public class _2NonStaticMethod {

	public static void main(String[] args) {
		_2NonStaticMethod ns = new _2NonStaticMethod();
		int n = ns.add(1, 2);
		System.out.println(n);
		
		boolean y=ns instanceof _2NonStaticMethod;
		System.out.println(y);

	}

	// Method with return type
	public int add(int a, int b) {
		int sum = a + b;
		return sum;
	
	}
	
	

}
