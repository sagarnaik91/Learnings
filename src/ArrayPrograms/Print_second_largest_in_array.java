package ArrayPrograms;

public class Print_second_largest_in_array {

	public static void main(String[] args) {
		int[] arr1 = new int[] { 1, 4, 2, 8, 9, 4 };
		int[] arr2 = new int[] { 4, 11, 7, 9, 3 };
		System.out.println(secondLargest(arr1,arr1.length));
		System.out.println(secondLargest(arr2,arr2.length));

	}
	
	public static int secondLargest(int[] arr,int n)
	{
		int temp=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		return arr[n-2];
	}

}
