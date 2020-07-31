package demo.work;

public class ArrAsc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {78,56,1,4,67,3,35,67,0};
			int temp=0;
			for (int i = 0; i < array.length; i++) {
				for (int j = i+1; j < array.length; j++) {
					if(array[i]>array[j])
					{
						temp=array[i];
						array[i]=array[j];
						array[j]=temp;
					}
				}
			}
			
			for (int k = 0; k < array.length; k++) {
				System.out.print(array[k]+" ");
			}
	}

}
