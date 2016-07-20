package patternDecorator;

public class Cream extends Decorator {

	Coffee coffee;
	
	public Cream(Coffee coffee){
		setCoffee(coffee);
	}
	
	public double cost() {
		return this.coffee.cost() + 2;
	}

	public String getDescription() {

		return this.coffee.getDescription() + " with cream";
	}
	
	public void setCoffee(Coffee coffee){
		this.coffee = coffee;
	}

}
