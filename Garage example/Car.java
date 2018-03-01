
public class Car extends Vehicle {
	public int numberOfDoors;
	
	
	public Car(int mileage, double weight, String id, int price, boolean isBroken, boolean needsClean, int numberOfDoors) {
		super(mileage, weight, id, price, isBroken, needsClean);
		this.numberOfDoors = numberOfDoors;
		
		
		
		
		//System.out.println(this.getClass().getCanonicalName());   // look at this, means you dont need a type attribute 
		// remove type from vehicle and make it more efficient
	}
	

}
