package methods;

public class _4ClassUses_3SingleParameterNonStaticMethod {

	// Calling method written in another class within a same package
	public static void main(String[] args) {
		_3SingleParameterNonStaticMethod spm = new _3SingleParameterNonStaticMethod();
		spm.pu = 9; //public global variable can be used in all the classes within or outside package
		spm.prot = 8; // protected global variable can be used in classes within the package
		int nPublic = spm.squarePublic(3);
		int nProtected = spm.squareProtected(3);
		/**
		 * private method in class _3SingleParameterMethod cannot be used in another
		 * class, be it within same package or different package int
		 * nPrivate=spm.squarePrivate(3);
		 **/
		System.out.println("nPublic " + nPublic);
		System.out.println("nProtected " + nProtected);// protected method can be used in different class within same
														// package
		// System.out.println("nPrivate "+nPrivate);

	}

}
