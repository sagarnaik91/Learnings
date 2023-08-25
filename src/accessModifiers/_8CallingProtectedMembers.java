package accessModifiers;

public class _8CallingProtectedMembers extends _7ExampleOfProtectedAccessModifier{

	public static void main(String[] args) {
		_7ExampleOfProtectedAccessModifier ex=new _7ExampleOfProtectedAccessModifier();
		int a=ex.a=7;
		ex.display();
		System.out.println(a);

	}

}
