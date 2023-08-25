package javaFlowControl;

public class _2NestedIfElse {

	public static void main(String[] args) {
		double n1 = 8, n2 = 6, n3 = 11, largest = 0;
		if (n1 > n2) {
			if (n1 > n3) {
				largest = n1;
			} else {
				largest = n3;
			}
		} else {
			if (n2 > n3) {
				if (n2 > n1) {
					largest = n2;
				}

			}

			else {
				largest = n3;
			}
		}
		System.out.println("Largest number is " + largest);
	}

}
