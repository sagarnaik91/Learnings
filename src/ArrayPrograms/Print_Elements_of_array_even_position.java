package ArrayPrograms;

public class Print_Elements_of_array_even_position {

	public static void main(String[] args) {
		int[] arr=new int[] {1,4,2,3,8,6,5,2,8};
		for(int i=1;i<arr.length;i=i+2)
		{
			System.out.println(arr[i]);
		}

	}

}
