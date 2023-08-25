package ArrayPrograms;

public class Print_the_smallest_elements_in_a_array {

	public static void main(String[] args) {
		
		int[] arr=new int[]{1,4,2,9,14,3,9,1,1};
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println(min);
	}

}
