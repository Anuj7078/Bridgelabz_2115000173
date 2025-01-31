import java.util.*;
public class EmpolyeeDetails{
	private String EmpName;
	private int EmpId, EmpSalary;
	Empolyee(String Name, int Id, int Salary){
		EmpName = Name;
		EmpId = Id;
		EmpSalary = Salary;
	}
	private void setDetails(String EmpName, int EmpId, int EmpSalary){
		this.EmpName = EmpName;
		this.EmpId = EmpId;
		this.EmpSalary = EmpSalary;
	}
	private void displayDetails(){
		System.out.println("Empolyee Name: "+EmpName);
		System.out.println("Empolyee Id: "+EmpId);
		System.out.println("Empolyee Salary: "+EmpSalary);
	}
	
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Empolyee Name: ");
		String empName = sc.nextLine();
		System.out.print("Enter the Empolyee Id: ");
		int empId = sc.nextInt();
		System.out.print("Enter the Empolyee Salary: ");
		int empSalary = sc.nextInt();
		
		Empolyee emp = new Empolyee(empName,empId,empSalary);
		emp.displayDetails();
		emp.setDetails("Anuj",2115000173,30000);
		emp.displayDetails();
		sc.close();
	}
}