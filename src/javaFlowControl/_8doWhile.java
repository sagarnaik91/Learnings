package javaFlowControl;

import java.util.Scanner;

public class _8doWhile {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		int num=0;
		do
		{
			sum=sum+num;
			System.out.println("Enter a positive number");
			num=sc.nextInt();
			//break;
		}
		while(num>0);
		System.out.println(sum);
	}

}
