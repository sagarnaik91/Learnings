package ArrayPrograms;

public class Print_Elements_of_array_in_reverse_order {

	public static void main(String[] args) {
		
		int[] arr=new int[] {1,5,2,3,6,4,0};
		System.out.println("Original array elements");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("reversed array elements");
		for(int j=arr.length-1;j>=0;j--)
		{
			System.out.println(arr[j]);
		}
	}

}
