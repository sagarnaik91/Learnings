package basicAndPatternProgram;

public class Factorial {

	public static void main(String[] args) {
		Factorial f=new Factorial();
		f.factorial(4);
	}
	
	public void factorial(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
	

}
