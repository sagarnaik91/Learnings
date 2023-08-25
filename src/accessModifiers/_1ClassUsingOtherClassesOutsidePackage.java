package accessModifiers;

import methods._3SingleParameterNonStaticMethod;

public class _1ClassUsingOtherClassesOutsidePackage {

	public static void main(String[] args) {
		_3SingleParameterNonStaticMethod spm = new _3SingleParameterNonStaticMethod();
		spm.pu=8;//public global variable can be used in all the classes within or outside package
		// protected global variable cannot be used in classes outside the package
		int nPublic = spm.squarePublic(3);
		/**
		 * protected method in a class _3SingleParameterMethod cannot be used in another
		 * class outside a package int nProtected = spm.squareProtected(3);
		 **/
		/**
		 * private method in class _3SingleParameterMethod cannot be used in another
		 * class, be it within same package or different package 
		 * int nPrivate=spm.squarePrivate(3);
		 **/
		System.out.println("nPublic " + nPublic);
		// System.out.println("nProtected " + nProtected);
		// System.out.println("nPrivate "+nPrivate);

	}

}
