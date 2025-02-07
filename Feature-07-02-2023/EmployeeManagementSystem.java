class Employee {
    String name;
    int id;
    int salary;

    Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}
class Manager extends Employee {
    int teamSize;
    Manager(String name, int id, int salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}
class Developer extends Employee {
    String programmingLanguage;
    Developer(String name, int id, int salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}
class Intern extends Employee {
    int duration;
    Intern(String name, int id, int salary, int duration) {
        super(name, id, salary);
        this.duration = duration;
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + duration + " months");
    }
}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee manager = new Manager("Anuj", 01, 100000, 8);
        Employee developer = new Developer("Kunal", 02, 40000, "Java");
        Employee intern = new Intern("Roshi", 03, 20000, 4);

        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();
    }
}
