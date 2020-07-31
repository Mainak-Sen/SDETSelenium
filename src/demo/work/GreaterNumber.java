package demo.work;

import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if(a>b)
		{
			System.out.println(a+"is greater");
		}
		else
		{
			System.out.println(b+"is greater");
		}*/
				
		String names[]= {"RB","Kuldeep","Ravi","Monika","Koushik"};
		for(int i=0;i<names.length;i++)
		{
			if(i%2!=0)
			{
				continue;
			}
			else
			{
				System.out.println(names[i]);
			}
		}
	}
		

}
