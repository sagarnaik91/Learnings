package constructor;

public class _3ParameterisedConstructor {
	String a;

	protected _3ParameterisedConstructor(String a) {
		a = a;
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		_3ParameterisedConstructor ex1=new _3ParameterisedConstructor("Java");
		_3ParameterisedConstructor ex2=new _3ParameterisedConstructor("C#");
		_3ParameterisedConstructor ex3=new _3ParameterisedConstructor("Python");
		

	}

}
