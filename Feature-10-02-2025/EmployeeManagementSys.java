import java.util.*;
class EmployeeManagementSys{
	public static void main(String[]args){
		List<Employee> list = new ArrayList<>();
		FullTimeEmployee emp1 = new FullTimeEmployee(1, "Anuj", 90000, 10);
		PartTimeEmployee emp2 = new PartTimeEmployee(2, "Chitranshi", 50000, 14);
		
		emp1.assignDepartment("IT");
		emp2.assignDepartment("HR");
		list.add(emp1);
		list.add(emp2);
		for(Employee employee : list){
			employee.displayDetails();
			System.out.println("Total Salary: "+employee.calculateSalary());
				System.out.println("Employee Department: "+((Department)employee).getDepartmentDetails());
				System.out.println("******************************");
		}
	}
}
abstract class Employee{
	private int employeeId, baseSalary;
	private String name;
	Employee(int employeeId, String name, int baseSalary){
		this.employeeId = employeeId;
		this.name = name;
		this.baseSalary = baseSalary;
	}
	abstract int calculateSalary();
	public void displayDetails(){
		System.out.println("Employee Id: "+ employeeId);
		System.out.println("Employee Name: "+ name);
		System.out.println("Employee Base Salary: "+ baseSalary);
	}
	public int getBaseSalary(){
		return baseSalary;
	}
}
class FullTimeEmployee extends Employee implements Department{
	private int workHour;
	private String DepartmentName;
	FullTimeEmployee(int employeeId, String name, int baseSalary, int workHour){
		super(employeeId, name, baseSalary);		
		this.workHour = workHour;
    }
	int calculateSalary(){
		int salary = getBaseSalary() * workHour;
		return salary;
	}
	public void assignDepartment(String DepartmentName){
		this.DepartmentName = DepartmentName;
	}
	public String getDepartmentDetails(){
		return DepartmentName;
	}

}
class PartTimeEmployee extends Employee implements Department{
	private int workHour;
	private String DepartmentName;
	PartTimeEmployee(int employeeId, String name, int baseSalary, int workHour){
		super(employeeId, name, baseSalary);		
		this.workHour = workHour;
	}
	int calculateSalary(){
		int salary = getBaseSalary() * workHour;
		return salary;
	}
	public void assignDepartment(String DepartmentName){
		this.DepartmentName = DepartmentName;
	}
	public String getDepartmentDetails(){
		return DepartmentName;
	}
}
interface Department{
	void assignDepartment(String DepartmentName);
	String getDepartmentDetails();
}