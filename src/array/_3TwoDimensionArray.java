package array;

public class _3TwoDimensionArray {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 9, 8, 7, 6 }, { 4, 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 1 } };
		System.out.println("Length of arr is " + arr.length);
		System.out.println("Length of arr[0] is " + arr[0].length);
		System.out.println("Length of arr[1] is " + arr[1].length);
		System.out.println("Length of arr[2] is " + arr[2].length);
		System.out.println("Length of arr[3] is " + arr[3].length);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("arr[" + i + "][" + j + "] is " + arr[i][j]);
			}
		}

		System.out.println("*********");

		for (int[] oneDimensionArray : arr) {
			for (int item : oneDimensionArray) {
				System.out.println(item);
			}
		}
	}
}
