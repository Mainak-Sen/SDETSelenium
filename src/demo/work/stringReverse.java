package demo.work;

public class stringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Program to reverse a string 
		String name="madam";
		String reverse="";
		for (int i =name.length()-1; i>=0; i--) {
			reverse=reverse+name.charAt(i);
			
		}
		
		System.out.println(reverse);
		
		//Program to find out the number of occurrences of a 
		/*String name="madam";
		int counter=0;
		
		for (char c:name.toCharArray()) {
			if(c=='d')
			{
				counter++;
			}
			
		
		}
		System.out.println("The number of occurences of d is:"+counter);*/
		
		
		

	}
	
	

}
