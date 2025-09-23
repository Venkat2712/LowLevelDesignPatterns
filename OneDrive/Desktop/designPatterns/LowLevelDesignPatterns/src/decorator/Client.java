package decorator;

public class Client {

	public static void main(String[] args) {
		
		Beverage beverage = new Espresso();
		
		System.out.println(beverage.getCost());
		beverage.getDescription();
		
		
		Beverage b1 = new Whip(beverage);
		
		System.out.println(b1.getCost());
		b1.getDescription();
		Beverage b2 = new Whip(b1);
		System.out.println(b2.getCost());
		b2.getDescription();
		
		

	}

}
