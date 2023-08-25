package stringPrograms1;

public class Class13 {

	public static void reverseString(String S1)
	{
		String result="";
		String[] S2=S1.split("\\W+");
		for(int i=0;i<S2.length;i++)
		{
			if(i==S2.length-1)
			{
				result=" "+S2[i]+result;
			}
			else
			{
				result=" "+S2[i]+result;
			}
		}
		System.out.println(result);
	}
	public static void main(String[] args) {
		
		
		reverseString("My name is Sagar");

	}

}
