package demo.work;

import java.util.Scanner;

public class RenNumberRecursion {
	
	private static void revNumber(int n) {
		
		if(n<10)
		{
			System.out.println(n);
		}
		else
		{
			System.out.print(n%10);
			revNumber(n/10);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number you want to reverse:");
		int num = sc.nextInt();
		revNumber(num);
		

	}

}
