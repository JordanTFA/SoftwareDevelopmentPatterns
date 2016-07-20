package patternDecorator;

public class Syrup extends Decorator {

	Coffee coffee;
	
	public Syrup(Coffee coffee){
		setCoffee(coffee);
	}

	public double cost() {
		return this.coffee.cost() + 4;
	}


	public String getDescription() {
		return this.coffee.getDescription() + " with syrup";
	}
	
	public void setCoffee(Coffee coffee){
		this.coffee = coffee;
	}

}
