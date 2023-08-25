package basicAndPatternProgram;

public class Prime {

	public static void main(String[] args) {
		checkPrime(1);

	}
	
	public static void checkPrime(int n)
	{
		int m=0,flag=0;
		//m=n/2;
		if(n==0||n==1)
		{
			System.out.println(n +" is not a prime");
			
		}
		else
			for(int i=1;i<=n;i++)
			{
				if(n%2==0)
				{
					System.out.println(n +" is not a prime");
					flag=1;
					break;
				}
			}
		if(flag==0)
		{
			System.out.println(n +" is a prime");
		}
	}

}
