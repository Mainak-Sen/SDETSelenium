package demo.work;

import java.util.Scanner;

public class SumN {
	
	private static boolean is_prime(int number)
	{
		int counter=0;
		if(number == 1)
		{
			return false;
		}
		else
		{
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				counter++;
			}
		}
		
		if(counter>2)
		{
			return false;
		}
		else
		{
			return true;
		}
		
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Program to print the sum of first n natural numbers 
		/*Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println((float)(n*(n+1))/2);
	}*/
	
	//Printing first 10 prime numbers 
		//We will be calling the above static is_prime function to verify the number is prime or not  repeatedly until we get the required count of prime numbers as expected .
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=0;
		int no=1;
		while(count!=n)
		{
			if(is_prime(no)) {
				System.out.println(no);
				count++;
				}
				no++;
		}
		
		
}
}
