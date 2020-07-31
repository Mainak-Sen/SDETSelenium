package demo.work;

import java.util.Scanner;

public class FactorialRecursion {
	
	public static int factorial(int n) {
		if(n==0)
		{
			return 1;
		}
		else
		{
			return n*factorial(n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Factorial of the given number is:"+factorial(n));
	}

}
