package ArrayPrograms;

public class Print_smallest_number {

	public static void main(String[] args) {
		int[] arr1=new int[] {4,2,9,4,8};
		int[] arr2=new int[] {7,4,1,9,5};
		System.out.println(smallestNumber(arr1,arr1.length));
		System.out.println(smallestNumber(arr2,arr2.length));

	}
	
	public static int smallestNumber(int[] arr, int n)
	{
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		return arr[0];
	}

}
