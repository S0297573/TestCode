package testcode;

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String car = "Tesla";
		String model = "Model S";
		String carFullName = car +" "+ model;
		int price = 30000;
		String color = "Black";
		float carBattery = 9999.9f;
		float carAfterRepair = price - carBattery;
		System.out.println("Top EV vehicle: "+ car);
		System.out.println("Price of the vehicle: " + price);
		System.out.println("Top color choice of customer: "+ color);
		System.out.println("Best model for average customer: " + model);
		System.out.println("Full Name of the vehicle: " + carFullName);
		System.out.println("If the car has changed the battery: "+ carAfterRepair);
		
		
	}

}
