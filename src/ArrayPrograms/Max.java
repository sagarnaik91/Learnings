package ArrayPrograms;

import java.util.Arrays;

public class Max {

	public static void main(String[] args) {
		int[] arr=new int[]{23, 43,12, 19, 10, 52, 78, 25, 99, 2 };
		Arrays.sort(arr);
		System.out.println("Max is "+arr[arr.length-1]);
		System.out.println("second max is "+ arr[arr.length-2]);
		System.out.println("Min is "+ arr[0]);
		System.out.println("Second min is "+ arr[1]);

	}

}
