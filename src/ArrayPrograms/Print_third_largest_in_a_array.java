package ArrayPrograms;

public class Print_third_largest_in_a_array {

	public static void main(String[] args) {
		int[] arr1 = { 3, 8, 1, 9, 6, 5 };
		int[] arr2 = { 1, 8, 3, 7, 6 };
		System.out.println(thirdLargestNumber(arr1,arr1.length));
		System.out.println(thirdLargestNumber(arr2,arr2.length));

	}
	
	public static int thirdLargestNumber(int[] arr,int n)
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
		return arr[n-3];
		
	}

}
