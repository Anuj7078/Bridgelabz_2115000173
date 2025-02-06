import java.util.*;
class UniversityFacultiesAndDept{
	public static void main(String[]args){
		University university = new University("GLA University");
		
		Department dept1 = new Department("CSE");
		Department dept2 = new Department("EE");
		
		university.addDepartment(dept1);
		university.addDepartment(dept2);
		
		Faculty faculty1 = new Faculty("Justin Bieber");
		Faculty faculty2 = new Faculty("Virat Kohli");
		
		dept1.addFaculty(faculty1);
		dept1.addFaculty(faculty2);
		
		dept2.addFaculty(faculty2);
		
		university.showDepartments();
		dept1.showFaculties();
		dept2.showFaculties();
		
		university.deleteUniversity();
		
	}
}
class University{
	private String universityName;
	private List<Department> departments;
	University(String universityName){
		this.universityName = universityName;
		this.departments = new ArrayList<>();
	}
	public void addDepartment(Department dept){
		departments.add(dept);
	}
	public void showDepartments(){
		for(Department dept : departments)
			System.out.println("Department: "+dept.getDeptName());
	}
	public void deleteUniversity(){
		departments.clear();
		System.out.println("University Deleted.");
	}
	
}
class Department{
	private String deptName;
	private List<Faculty> faculties;
	Department(String deptName){
		this.deptName = deptName;
		this.faculties = new ArrayList<>();
	}
	public String getDeptName(){
		return deptName;
	}
	public void addFaculty(Faculty faculty){
		faculties.add(faculty);
	}
	public void showFaculties(){
		for(Faculty faculty : faculties)
			System.out.println("Faculty: "+faculty.getFacultyName());
	}
}
class Faculty{
	private String facultyName;
	Faculty(String facultyName){
		this.facultyName = facultyName;
	}
	public String getFacultyName(){
		return facultyName;
	}
}