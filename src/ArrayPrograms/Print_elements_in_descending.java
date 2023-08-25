package ArrayPrograms;

public class Print_elements_in_descending {

	public static void main(String[] args) {
		int temp=0;
		int[] arr=new int[] {1,3,2,9,8,4};
		System.out.println("Printing the original array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Printing in descending order");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
