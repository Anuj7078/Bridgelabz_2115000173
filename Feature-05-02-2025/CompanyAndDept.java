import java.util.*;
class CompanyAndDept {
    public static void main(String[] args) {
        Company company = new Company("Meritto");

        company.addDepartment("HR");
        company.addDepartment("Management");

        company.addEmployeeToDepartment("HR", "Anuj");
        company.addEmployeeToDepartment("Management", "Ashu");

        company.showCompanyDetails();
    }
}
class Employee {
    private String name;
    Employee(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
class Department {
    private String name;
    private List<Employee> employees;
    Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }
    public void addEmployee(String employeeName) {
        employees.add(new Employee(employeeName));
    }
    public String getName() {
        return name;
    }
    public List<Employee> getEmployees() {
        return employees;
    }
}
class Company {
    private String name;
    private List<Department> departments;
    Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }
    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }
    public void addEmployeeToDepartment(String departmentName, String employeeName) {
        for (Department dept : departments) {
            if (dept.getName().equals(departmentName)) {
                dept.addEmployee(employeeName);
                return;
            }
        }
        System.out.println("Department " + departmentName + " not found!");
    }
    public void showCompanyDetails() {
        System.out.println("Company Name: " + name);
        for (Department dept : departments) {
            System.out.println("Department Name: " + dept.getName());
            for (Employee emp : dept.getEmployees()) {
                System.out.println("  Employee Name: " + emp.getName());
            }
        }
    }
}
