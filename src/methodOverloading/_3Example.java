package methodOverloading;

public class _3Example {

	private String formatNumber(int a) {
		return String.format("%d", a);
	}

	private String formatNumber(double a) {
		return String.format("%.2f", a);
	}

	private String formatNumber(String a) {
		return String.format("%.2f", Double.parseDouble(a));
	}

	public static void main(String[] args) {
		_3Example ex = new _3Example();
		System.out.println(ex.formatNumber(1));
		System.out.println(ex.formatNumber(13.5456));
		System.out.println(ex.formatNumber("100"));
	}
}
