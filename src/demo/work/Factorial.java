package demo.work;

import java.util.Scanner;

public class Factorial {
	
	public static int factorialn(int n) {
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			if(n==0)
			{
				fact=1;
			}
			else
			{
			fact=fact*i;
			}
		}
		
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Factorial of the given number is:"+factorialn(n));
		
		
		

	}

}
