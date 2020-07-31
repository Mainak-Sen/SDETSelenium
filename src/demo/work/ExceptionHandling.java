package demo.work;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ExceptionHandling{
	int a=5;
	int b;
	public String ParentDemo(){
	
		
		try {
			b=a/0;
			return "Trying to divide by zero";
			
		} catch (Exception e) {
			//System.out.println("Zero divide Exception is handled");
			return "Zero divide Exception is handled";
		}
		finally
		{
			return "Can I return?";
			//System.out.println("Print something");  // unreachable code error if we  write a code after return statement in finally block
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your input");
		int input= sc.nextInt();
		int b;
		int[] array = {1,2,3,4,5};
		
		
		//String datestr = "05/24/2020";
		/*SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		//Date date;
		
		try
		{
			//Date date=format.parse(new Date().toString());
			//format.parse(user_input_date);
			System.out.println(format.parse(user_input_date));
		}
		catch(ParseException e)
		{
			System.out.println("Parse-Exception has occured "+e);
		}*/
		//System.out.println(array[6]);
		try
		{
		  System.out.println("Entering try block");
		  b=input/0;
		  System.out.println("I am after the above apprehended exception");
		}
		catch(Exception e)
		{
			System.out.println("Zero divide  Arithmetic exception is handled ");
		}
		/*catch(ArithmeticException e)
		{
			System.out.println("Zero divide  Arithmetic exception is handled ");
		}*/
		//finally block will not execute if there is no try block,catch is optional for it 
		//Finally block will not execute if exception occurs before the try block itself.The sole point of using finally block is rendered futile 
		  //if there is no try block
		finally
		{
			System.out.println("I will always execute ");
		}
		
		
	
		

	}

}
