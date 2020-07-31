package demo.work;

public abstract class Vodafone implements TRAI {
	
	
	
	 int dailySMSlinit;
	 
	Vodafone(){
		this.dailySMSlinit=100;
	}

	@Override
	public void Rule_One() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Rule_two() {
		// TODO Auto-generated method stub
		System.out.println("Vodafone Rule 2");
		
	}

	@Override
	public void Rule_three() {
		// TODO Auto-generated method stub
		System.out.println("Vodafone Rule 3");
	}

}
