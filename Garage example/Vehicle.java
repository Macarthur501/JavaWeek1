
public abstract class Vehicle {
	public int mileage;
	public double weight;
	public String id;
	public int price;
	public boolean isBroken;
	public boolean needsClean;
	
	
	
	public Vehicle(int mileage, double weight, String id, int price, boolean isBroken, boolean needsClean) {
		this.mileage = mileage;
		this.weight = weight;
		this.id = id;
		this.price = price;
		this.isBroken = isBroken;
		this.needsClean = needsClean;
		
		
	}
	public String getID() {
		return id;
	}
	public int getMileage() {
		return mileage;
	}
	public boolean getIsBroken() {
		return isBroken;
	}
	public boolean getNeedsClean() {
		return needsClean;
	}

	}

