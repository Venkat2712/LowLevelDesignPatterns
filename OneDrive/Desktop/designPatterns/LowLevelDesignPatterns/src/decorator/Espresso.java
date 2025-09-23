package decorator;

public class Espresso  extends Beverage{
	
	

	@Override
	public int getCost() {
		return 200;
	}

	@Override
	public void getDescription() {
		System.out.println("Espresso Beverage ");
		
	}

}
