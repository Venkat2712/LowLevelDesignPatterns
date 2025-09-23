package decorator;

public class Whip extends AddOn {
	private Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage=beverage;
		
	}

	@Override
	public int getCost() {
		
		return 20+beverage.getCost();
	}

	@Override
	public void getDescription() {
		beverage.getDescription();
		System.out.println("Added Whip");
	}

}
