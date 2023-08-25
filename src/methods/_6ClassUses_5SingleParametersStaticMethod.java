package methods;

public class _6ClassUses_5SingleParametersStaticMethod {

	public static void main(String[] args) {
		_5SingleParameterStaticMethod.pu = 8;
		_5SingleParameterStaticMethod.prot = 9;

		int nPublic = _5SingleParameterStaticMethod.squarePublic(6);
		int nProtected = _5SingleParameterStaticMethod.squareProtected(6);
		// int nPrivate=_5SingleParameterStaticMethod private method cannot be accessed
		// from other class

	}

}
