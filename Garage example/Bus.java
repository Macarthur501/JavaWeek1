
public class Bus extends Vehicle {
	boolean doubleDeck;
	
	
	public Bus(int mileage, double weight, String id, int price, boolean isBroken, boolean needsClean, boolean doubleDeck) {
		super(mileage, weight, id, price, isBroken, needsClean);
		this.doubleDeck = doubleDeck;
		
	}

	public boolean getDoubleDeck() {
		return doubleDeck;
		
	}
}
