package ArrayPrograms;

public class Print_largest_in_a_array {

	public static void main(String[] args) {
		int[] arr=new int[] {1,4,2,9,4,0,4,6,14};
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(max);

	}

}
