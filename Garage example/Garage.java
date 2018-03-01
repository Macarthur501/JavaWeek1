import java.util.ArrayList;

public class Garage {
	public ArrayList<Vehicle> vehicleList;
	public Garage() {
		vehicleList = new ArrayList<Vehicle>();
		
		
	
	}

	public void addVehicleCar(int mileage, double weight, String iD, int price, boolean needsFixing, boolean needsClean, int numberOfDoors) {
		Car car = new Car(mileage, weight, iD, price, needsFixing, needsClean, numberOfDoors);
		vehicleList.add(car);
		
		
		}
		
	public void addVehicleMotorcycle(int mileage, double weight, String iD, int price, boolean needsFixing, boolean needsClean, int ccEngineSize) {
		Motorcycle bike = new Motorcycle(mileage, weight, iD, price, needsFixing, needsClean, ccEngineSize);
		vehicleList.add(bike);
		}	
	public void addVehicleBus(int mileage, double weight, String iD, int price, boolean needsFixing, boolean needsClean, boolean doubleDeck) {
		Bus bus = new Bus(mileage, weight, iD, price, needsFixing, needsClean, doubleDeck);
		vehicleList.add(bus);
		}
	public Vehicle findVehicle(ArrayList<Vehicle> vehicleList, String iD) {
		Vehicle desiredVehicle = null;
		for ( Vehicle v : vehicleList) {
			if (v.getID() == iD) {
				
				desiredVehicle = v;
				break;
			}
		}
		return desiredVehicle;
	}
	
	public double calculateBill(Vehicle desiredVehicle) {
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
			Bus bus = (Bus) desiredVehicle;
			if (bus.getDoubleDeck()) {
				if (bus.getIsBroken()){
					totalBill += basicFix*1.5;
				}
				else {
					totalBill += basicFix*1.2;
				}
				}
				
			if (bus.getNeedsClean()) {
				totalBill += 50.00;
				}
			
			if (bus.getMileage() > 50000) {
				totalBill += 50.00;
			}
			break;}
		
		
		return totalBill;
	}		
	
		
		
		
		
	public ArrayList<Vehicle> removeVehicle(ArrayList<Vehicle> vehicleList, String iD) {
		int pos = 0;
		for ( Vehicle v : vehicleList) {
			if (v.getID() == iD) {
				pos = vehicleList.indexOf(v);
				}
			}
	
		if (pos == 0) {
			System.out.println("Vehicle not found!");
			}
		else {
			vehicleList.remove(pos);
			}
		return vehicleList;
	}
	public ArrayList<Vehicle> clearVehicleList(ArrayList<Vehicle> vehicleList) {
		vehicleList.clear();
		return vehicleList;
	}



}



	
	


