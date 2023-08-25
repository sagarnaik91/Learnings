package ArrayPrograms;

public class Sum_of_all_elements_in_a_array {

	public static void main(String[] args) {
		
		int[] arr=new int[] {1,7,3,9,8,2};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println(sum);

	}

}
