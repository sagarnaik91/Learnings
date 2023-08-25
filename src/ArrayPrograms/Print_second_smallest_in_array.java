package ArrayPrograms;

import java.util.Arrays;

public class Print_second_smallest_in_array {

	public static void main(String[] args) {
		int[] arr1 = new int[] { 2, 1, 3, 7, 5 };
		int[] arr2 = new int[] { 7, 3, 4, 9, 2 };
		System.out.println(secondSmallest(arr1, arr1.length));
		System.out.println(secondSmallest(arr2, arr2.length));

	}

	public static int secondSmallest(int[] arr, int n) {
		Arrays.sort(arr);
		return (arr[1]);
	}

}
