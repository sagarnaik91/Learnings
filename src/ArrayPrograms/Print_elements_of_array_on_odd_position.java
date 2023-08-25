package ArrayPrograms;

public class Print_elements_of_array_on_odd_position {

	public static void main(String[] args) {
		int[] arr=new int[] {1,4,2,8,5,3,8,9};
		for(int i=0;i<arr.length;i=i+2)
		{
			System.out.println(arr[i]);
		}

	}

}
