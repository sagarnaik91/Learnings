package javaFlowControl;

public class _5ForEachLoop {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 3, 6, 4, 9 };
		int sum=0;
		for (int a : arr) {
			sum=sum+a;

		}
		System.out.println(sum);

	}

}
