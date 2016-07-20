package patternDecorator;

public class Milk extends Decorator {

	Coffee coffee;

	public Milk(Coffee coffee){
		setCoffee(coffee);
	}
	public double cost() {
		return this.coffee.cost() + 1;
	}

	
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.coffee.getDescription() + " with milk";
	}

	
	public void setCoffee(Coffee coffee){
		this.coffee = coffee;
	}
}
