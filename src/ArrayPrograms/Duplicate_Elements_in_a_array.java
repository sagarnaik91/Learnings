package ArrayPrograms;

public class Duplicate_Elements_in_a_array {

	public static void main(String[] args) 
	{
		int[] arr=new int[] {1,2,2,3,4,5,8};
		System.out.println("Duplicate numbers are");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
				}
			}
		}
	}

}
