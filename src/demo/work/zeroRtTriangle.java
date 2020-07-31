package demo.work;

public class zeroRtTriangle {
	
	/*static String str1="Hello World";
	static String str2="Hello World";*/
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println(str1.replace('H', 'J'));
		System.out.println(str1);*/
		
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				if(j<(9-i)) {
				System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
				
				
			}
			System.out.println();
			
		}

	}

}
