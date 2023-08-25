package methods;

public class _5SingleParameterStaticMethod {
	public  static int pu;
	protected static int prot;
	private static int pri;
	public static void main(String[] args) {
		
		int nPublic = squarePublic(6);
		int nProtected = squareProtected(6);
		int nPrivate = squarePrivate(6);
		System.out.println("nPublic "+nPublic);
		System.out.println("nProtected "+nProtected);
		System.out.println("nPrivate "+nPrivate);
		
		

	}
	//Method with return type
	public static int squarePublic(int a) {
		int square = a * a;
		return square;
	}
	protected static int squareProtected(int a) {
		int square = a * a;
		return square;
	}

	private static int squarePrivate(int a) {
		int square = a * a;
		return square;
	}
}
