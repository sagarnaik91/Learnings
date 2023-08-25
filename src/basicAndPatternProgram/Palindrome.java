package basicAndPatternProgram;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[]args)
	{
		String original,reverse="";
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the number/String");
		//original=sc.nextLine();
		original="120";
		int length=original.length();
		for(int i=length-1;i>=0;i--)
		{
			reverse=reverse+original.charAt(i);
		}
		if(reverse.equals(original))
		{
			System.out.println("It is palindrome");
		}
		else
		{
			System.out.println("It is not palindrome");
		}
		
		
	}

}
