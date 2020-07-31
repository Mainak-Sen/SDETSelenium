package demo.work;

public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[]= {10,50,30};
		int greatest=num[0];
		int i=0;

while (i<num.length) {

	if(num[i]>greatest)
	{
		greatest=num[i];
	}
	i++;
}
		
System.out.println(greatest);

		
	}
}
