package demo.work;

public class StringSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = {"Ciaz","Alto", "Swift","Dezire","Brezza"};
		String temp="";
		for (int i = 0; i < str.length; i++) {
			for(int j = 0; j < str.length; j++)
			{
				
////comparing the string to check the lexicographical order,if the string is lexicographically ahead,we will swap it the string we are comparing it with.
				if(str[i].compareToIgnoreCase(str[j])<0)
				{
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		
		//Printing the values of the sorted string
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]+" ");
		}
	}

}
