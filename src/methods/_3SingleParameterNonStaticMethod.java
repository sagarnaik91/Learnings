package methods;

public class _3SingleParameterNonStaticMethod {
	public int pu;
	protected int prot;
	private int pri=9;
	public static void main(String[] args) {
		_3SingleParameterNonStaticMethod spm = new _3SingleParameterNonStaticMethod();
		int nPublic = spm.squarePublic(6);
		int nProtected = spm.squareProtected(6);
		int nPrivate = spm.squarePrivate(6);
		System.out.println("nPublic "+nPublic);
		System.out.println("nProtected "+nProtected);
		System.out.println("nPrivate "+nPrivate);
		

	}
	//Method with return type
	public int squarePublic(int a) {
		int square = a * a;
		return square;
	}
	protected int squareProtected(int a) {
		int square = a * a;
		return square;
	}

	private int squarePrivate(int a) {
		int square = a * a;
		return square;
	}
}
