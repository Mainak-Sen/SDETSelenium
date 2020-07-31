package demo.work;

public class ExceptionHandlingChild extends ExceptionHandling {
	int a=8;
	int b;
    public String ParentDemo(){
	
		
		try {
			b=a/0;
			
		} catch (ArithmeticException e) {
			System.out.println("Zero divide Exception is handled");
		}
		return null;
		
	}

	public static void main(String[] args){
		// TODO Auto-generated method stub

	}

}
