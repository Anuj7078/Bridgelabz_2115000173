import java.util.*;

public class Employee {
    private static String companyName = "Meritto";
    private static int totalEmployees = 0;
    private final int id;
    private String name;
    private String designation;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public static int getTotalEmployees() {
        return totalEmployees;
    }

    public int getId() {
        return id;
    }

    public void display() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Designation: " + designation);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of employees: ");
        int n = sc.nextInt();
        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.print("Enter "+(i+1)+" name: ");
            String name = sc.nextLine();
            System.out.print("Enter "+(i+1)+" ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter designation: ");
            String designation = sc.nextLine();

            employees[i] = new Employee(name, id, designation);
        }

        System.out.println("Total Employees Registered: " + getTotalEmployees());
        System.out.print("Enter Employee ID to display details: ");
        int searchId = sc.nextInt();
        boolean found = false;

        for (Employee emp : employees) {
            if (emp.getId() == searchId) {
                System.out.println("Employee Details:");
                if(emp instanceof Employee) {
                    emp.display();
                
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee with ID " + searchId + " not found.");
        }

        sc.close();
    }
}
