package javaFlowControl;

public class _3Switch {

	public static void main(String[] args) {
		int num = 44;
		String size;
		;
		switch (num) {
		case 38:
			size = "Medium";
			break;
		case 40:
			size = "Large";
			break;
		case 44:
			size = "ExtraLarge";
			break;
		default:
			size = "unknown";
			break;

		}
		System.out.println(size);

	}

}
