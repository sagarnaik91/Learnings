package ArrayPrograms;

import java.util.Arrays;

public class Print_largest_in_array {

	public static void main(String[] args) {
		int[] arr1 = new int[] { 3, 2, 8, 6, 5 };
		int[] arr2 = new int[] { 5, 4, 9, 3, 8 };

		System.out.println("largest number is "+largestNumber(arr1,arr1.length));
		System.out.println("largest number is "+largestNumber(arr2,arr2.length));
	}
	
	public static int largestNumber(int[] arr,int n)
	{
		Arrays.sort(arr);
		return arr[n-1];
	}

}
