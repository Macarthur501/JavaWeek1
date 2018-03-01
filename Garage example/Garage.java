import java.util.ArrayList;

public class Garage {


	public static void main(String[] args) {
		ArrayList<Vehicle> vehiclesInGarage = new ArrayList<Vehicle>();
		addVehicleCar(40000, 1234.5, "5755", 56000, true, false, 4, vehiclesInGarage);
		addVehicleBus(56000, 6546.8, "8998", 79000, true, true, true, vehiclesInGarage);
		System.out.println(calculateBill(findVehicle(vehiclesInGarage, "8998")));
		
	}




	public static void addVehicleCar(int mileage, double weight, String iD, int price, boolean needsFixing, boolean needsClean, int numberOfDoors,
													ArrayList<Vehicle> vehiclesInGarage) {
		Car car = new Car(mileage, weight, iD, price, needsFixing, needsClean, numberOfDoors);
		vehiclesInGarage.add(car);
		}
		
	public static void addVehicleMotorcycle(int mileage, double weight, String iD, int price, boolean needsFixing, boolean needsClean, int ccEngineSize,
														ArrayList<Vehicle> vehiclesInGarage) {
		Motorcycle bike = new Motorcycle(mileage, weight, iD, price, needsFixing, needsClean, ccEngineSize);
		vehiclesInGarage.add(bike);
		}	
	public static void addVehicleBus(int mileage, double weight, String iD, int price, boolean needsFixing, boolean needsClean, boolean doubleDeck,
														ArrayList<Vehicle> vehiclesInGarage) {
		Bus bus = new Bus(mileage, weight, iD, price, needsFixing, needsClean, doubleDeck);
		vehiclesInGarage.add(bus);
		}
	public static Vehicle findVehicle(ArrayList<Vehicle> vehicleList, String iD) {
		Vehicle desiredVehicle = null;
		for ( Vehicle v : vehicleList) {
			if (v.getID() == iD) {
				
				desiredVehicle = v;
				break;
			}
		}
		return desiredVehicle;
	}
	
	public static double calculateBill(Vehicle desiredVehicle) {
		double totalBill = 0.0;
		double basicFix = 150.00;
		switch(desiredVehicle.getClass().getCanonicalName()) {
		case"Motorcycle":
			{if (desiredVehicle.getIsBroken()){
				totalBill += basicFix;
				}
			if (desiredVehicle.getNeedsClean()) {
				totalBill += 20.00;
				}
			if (desiredVehicle.getMileage() > 50000) {
				totalBill += 50.00;
				}
			break;}
		case"Car":
			{if (desiredVehicle.getIsBroken()){
				totalBill += basicFix*1.1;
				}
			if (desiredVehicle.getNeedsClean()) {
				totalBill += 25.00;
				}
			if (desiredVehicle.getMileage() > 50000) {
				totalBill += 50.00;
				}
			break;}
		case"Bus":
			{if (desiredVehicle.getIsBroken()){
				totalBill += basicFix*1.2;
				}
			if (desiredVehicle.getNeedsClean()) {
				totalBill += 50.00;
				}
			if (desiredVehicle.getMileage() > 50000) {
				totalBill += 50.00;
			}
			break;}
		
		}
		return totalBill;
				
			
		
		
		}
		
		
		
		
		
		
		
	}




	
	


