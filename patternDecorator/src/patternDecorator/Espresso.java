package patternDecorator;

public class Espresso extends Coffee {

	public Espresso(){
		setDescription("Espresso");
	}
	
	public double cost() {
		return 8;
	}

}
