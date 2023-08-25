package thisKeyword;

public class _1Example {
	String name;

	_1Example(String a) {
		this.name = a;
		System.out.println(this);
		
	}

	public static void main(String[] args) {
		_1Example ex=new _1Example("Java is easy");
		_1Example ex1=new _1Example("Java is very easy");
		System.out.println(ex);
		System.out.println(ex1);
		

	}

}
