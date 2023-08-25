package javaFlowControl;

import java.util.Scanner;

public class _7WhileLoop {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		while(num>=0)
		{
			sum=sum+num;
			System.out.println("Enter a positive number");
			num=sc.nextInt();
		}
		
		System.out.println(sum);

	}

}
