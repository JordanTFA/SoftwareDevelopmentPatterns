package patternDecorator;

public class Main {

	public static void main(String[] args) {

		String output;
		
		Coffee myCoffee = new DarkRoast();
		myCoffee = new Milk(myCoffee);
		myCoffee = new Chocolate(myCoffee);
		myCoffee = new Syrup(myCoffee);
		myCoffee = new Cream(myCoffee);
		
		output = myCoffee.getDescription() + "\nCost = £" + myCoffee.cost();
		System.out.println(output);

	}

}
