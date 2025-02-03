import java.util.*;

public class Patient {
    private static String hospitalName = "Swarn Jayanti Hospital";
    private static int totalPatients = 0;
    private final int patientId;
    private String name;
    private int age;
    private String ailment;

    public Patient(int patientId, String name, int age, String ailment) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    public static int getTotalPatients() {
        return totalPatients;
    }

    public int getPatientId() {
        return patientId;
    }

    public void displayDetails() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Patient ID: " + patientId);
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Age: " + age);
        System.out.println("Ailment: " + ailment);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total Patients: ");
        int totalPatients = sc.nextInt();
        Patient[] patients = new Patient[totalPatients];

        for (int i = 0; i < totalPatients; i++) {
            System.out.println("Enter the "+(i+1)+" patient ID: ");
            int patientId = sc.nextInt();
            sc.nextLine(); 
            System.out.println("Enter the "+(i+1)+ " patient name: ");
            String name = sc.nextLine();
            System.out.println("Enter the "+(i+1)+" patient age: ");
            int age = sc.nextInt();
            sc.nextLine(); 
            System.out.println("Enter the ailment: ");
            String ailment = sc.nextLine();
            
            patients[i] = new Patient(patientId, name, age, ailment);
        }

        System.out.println("Total Patients Registered: " + getTotalPatients());
        System.out.println("Enter Patient ID to display details: ");
        int searchId = sc.nextInt();
        boolean flag = false;
        for (Patient patient : patients) {
            if (patient.getPatientId() == searchId) {
                System.out.println("Patient Details:");
                patient.displayDetails();
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Patient with ID " + searchId + " not found.");
        }
        sc.close();
    }
}
