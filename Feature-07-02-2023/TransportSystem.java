class Vehicle {
    int maxSpeed;
    String fuelType;
    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }
    void displayInfo() {
        System.out.println("Max Speed is " + maxSpeed + " km/h and Fuel Type id  " + fuelType);
    }
}
class Car extends Vehicle {
    int seatCapacity;
    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }
    void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity is " + seatCapacity);
    }
}
class Truck extends Vehicle {
    int loadCapacity;
    Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }
    void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity is " + loadCapacity + " tons");
    }
}
class Motorcycle extends Vehicle {
    boolean DoubleSeater;

    Motorcycle(int maxSpeed, String fuelType, boolean DoubleSeater) {
        super(maxSpeed, fuelType);
        this.DoubleSeater = DoubleSeater;
    }
    void displayInfo() {
        super.displayInfo();
        System.out.println("Is DoubleSeater: " + (DoubleSeater ? "Yes" : "No"));
    }
}
public class TransportSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[]{
            new Car(200, "Petrol", 5),
            new Truck(120, "Diesel", 30),
            new Motorcycle(180, "Petrol", true)
        };

        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            System.out.println();
        }
    }
}
