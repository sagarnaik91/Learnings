package accessModifiers;

import methods._5SingleParameterStaticMethod;

public class _2ClassUsingOtherClassesOutsidePackage {

	public static void main(String[] args) {
		int nPublic = _5SingleParameterStaticMethod.squarePublic(5);
		//protected method cannot be accessed by the class outside the package.
		_5SingleParameterStaticMethod.pu=9;
		System.out.println(nPublic);
	}

}
