package Recursion;

public class _1Recursion_Factorial {

	static int fact(int n) {
		if (n != 0) {
			return n * fact(n - 1);
		} else
			return 1;
	}
	
	public static void main(String [] args)
	{
		System.out.println(fact(5));
	}

}
