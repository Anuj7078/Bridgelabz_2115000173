import java.util.*;
class VehicleRentalSys{
	public static void main(String[]args){
		List<Vehicle> list = new ArrayList<>();
		Car car = new Car(1538, 200);
		Bike bike = new Bike(6743, 100);
		Truck truck = new Truck(7042, 300);
		list.add(car);
		list.add(bike);
		list.add(truck);
		for (Vehicle vehicle : list) {
            vehicle.displayDetails();
			double rentalCost = vehicle.calculateRentalCost(10);
			double insuranceCost = (vehicle instanceof Insurable) ? ((Insurable) vehicle).calculateInsurance() : 0;
			System.out.println("Rental Cost for " + 10 + " days: $" + rentalCost);
			System.out.println("Insurance Cost: " + insuranceCost+" Rs.");
            System.out.println(((Insurable) vehicle).getInsuranceDetails());
            System.out.println("*******************************************");
        }
	}
}
abstract class Vehicle{
	private int vehicleNumber, rentalRate;
	private String type;
	Vehicle(int vehicleNumber, String type, int rentalRate){
		this.vehicleNumber = vehicleNumber;
		this.type = type;
		this.rentalRate = rentalRate;
	}
	abstract double calculateRentalCost(int days);
	public void displayDetails(){
		System.out.println("Vehicle Number: "+ vehicleNumber);
		System.out.println("Vehicle Type: "+ type);
		System.out.println("Vehicle Rental Type: "+ rentalRate);
	}
	public int getRentalRate(){
		return rentalRate;
	}
}
class Car extends Vehicle implements Insurable{
	Car(int vehicleNumber, int rentalRate){
		super(vehicleNumber, "Car", rentalRate);		
	}
	double calculateRentalCost(int days){
		return getRentalRate() * days;
	}
	public double calculateInsurance() {
        return getRentalRate() * 0.05;
    }
    public String getInsuranceDetails() {
        return "Car Insurance: 5% of rental rate";
    }
}
class Bike extends Vehicle implements Insurable{
	Bike(int vehicleNumber, int rentalRate){
		super(vehicleNumber, "Bike", rentalRate);		
	}
	double calculateRentalCost(int days){
		return getRentalRate() * days;
	}
	public double calculateInsurance() {
        return getRentalRate() * 0.1;
    }
    public String getInsuranceDetails() {
        return "Bike Insurance: 10% of rental rate";
    }
}
class Truck extends Vehicle implements Insurable{
	Truck(int vehicleNumber, int rentalRate){
		super(vehicleNumber, "Truck", rentalRate);		
	}
	double calculateRentalCost(int days){
		return getRentalRate() * days;
	}
	public double calculateInsurance() {
        return getRentalRate() * 0.02;
    }
    public String getInsuranceDetails() {
        return "Truck Insurance: 2% of rental rate";
    }
}
interface Insurable{
	double calculateInsurance();
	String getInsuranceDetails();
}