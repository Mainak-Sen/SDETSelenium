package demo.work;

public class UcaseLcase {
	
	static String str = "AbCdefGHijklMNOpqRstUVwxyZ@%*234";
	static int upper=0;
	static int lower=0;
	static int number=0;
	static int special=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	    for(int i = 0; i < str.length(); i++) 
        { 
            char ch = str.charAt(i); 
            if (ch >= 'A' && ch <= 'Z') 
                upper++; 
            else if (ch >= 'a' && ch <= 'z') 
                lower++; 
            else if (ch >= '0' && ch <= '9') 
                number++; 
            else
                special++; 
        } 
  
        System.out.println("Lower case letters : " + lower); 
        System.out.println("Upper case letters : " + upper); 
        System.out.println("Number : " + number); 
        System.out.println("Special characters : " + special);
}
}
