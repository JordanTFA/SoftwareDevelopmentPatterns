package patternDecorator;

public class Chocolate extends Decorator {

	Coffee coffee;
	
	public Chocolate(Coffee coffee){
		setCoffee(coffee);
	}
	public double cost() {
		return this.coffee.cost() + 3;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return coffee.getDescription() + " with chocolate";
	}
	
	public void setCoffee(Coffee coffee){
		this.coffee = coffee;
	}

}
