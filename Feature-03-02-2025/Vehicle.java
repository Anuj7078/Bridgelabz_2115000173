import java.util.*;
public class Vehicle {
    private static int registrationFee = 1000;
    private final int registrationNumber;
    private static String ownerName;
    private static String vehicleType;

    public Vehicle(int registrationFee, String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationFee;
    }
    public static void updateRegistrationFee(int newFee) {
        registrationFee = newFee;
    }
    public void displayDetails() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the registration number: ");
        int registrationNumber = sc.nextInt();
        System.out.println("Enter the owner name: ");
        String ownerName = sc.next();
        System.out.println("Enter the vehicle type: ");
        String vehicleType = sc.next();
        Vehicle vehicle = new Vehicle(registrationNumber, ownerName, vehicleType);
        if(vehicle instanceof Vehicle) {
            System.out.println("Vehicle Registration Details: ");
            vehicle.displayDetails();
        }else{
            System.out.println("Vehicle object not identified");    
        }
        System.out.println("Enter the new registration fee: ");
        int newFee = sc.nextInt();
        Vehicle.updateRegistrationFee(newFee);
        System.out.println("Updated Registration Fee: " + registrationFee);
    }
}
