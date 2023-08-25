package javaFlowControl;

import java.util.Scanner;

public class _10Break {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		while (number > 0) {
			sum = sum + number;
			System.out.println("Enter the positive number");
			number = sc.nextInt();
			break;
		}

		System.out.println(sum);
	}

}
