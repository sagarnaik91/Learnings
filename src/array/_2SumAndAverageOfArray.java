package array;

public class _2SumAndAverageOfArray {
	static double n;

	public static void main(String[] args) {
		int[] numbers = { 4, 5, 3, 9, 8, 3, 10, 8 };
		n = sum(numbers);
		System.out.println("Sum is " + n);
		average(numbers);
	}

	public static int sum(int[] arr) {
		int sum = 0;
		for (int num : arr) {
			sum = sum + num;
		}
		return sum;
	}

	public static void average(int[] arr) {
		double average;
		average = n / arr.length;
		System.out.println("Average is " + average);
	}

}
