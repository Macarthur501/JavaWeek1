
public class Motorcycle extends Vehicle {
	public int ccEngineSize;
	
	public Motorcycle(int mileage, double weight, String id, int price, boolean isBroken, boolean needsClean, int ccEngineSize) {
		super(mileage, weight, id, price, isBroken, needsClean);
		this.ccEngineSize = ccEngineSize;
		
}}
