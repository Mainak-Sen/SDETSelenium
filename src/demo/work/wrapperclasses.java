package demo.work;

public class wrapperclasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String i ="20.89";
		System.out.println(Float.valueOf(i));
		
		Double d =56.789;
		String b="123";
		//adding a string and double using wrapper class
		System.out.println(Double.valueOf(i)+d);
		
		System.out.println(Boolean.valueOf(b));

	}

}
