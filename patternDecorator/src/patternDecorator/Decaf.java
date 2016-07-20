package patternDecorator;

public class Decaf extends Coffee {

	public Decaf(){
		setDescription("Decaf");
	}
	
	public double cost() {
		return 3;
	}

}
