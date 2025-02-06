import java.util.*;
class StudentSchoolAndCourses{
	public static void main(String[]args){
		School school = new School("Amarnath Vidya Ashram");
		Student student1 = new Student("Anuj");
		Student student2 = new Student("Ayush");
		
		Course course1 = new Course("Math");
		Course course2 = new Course("Physics");
		Course course3 = new Course("Chemistry");
		
		school.addStudent(student1);
		school.addStudent(student2);
		
		student1.addCourse(course1);
		student1.addCourse(course2);
		student1.addCourse(course3);
		student2.addCourse(course1);
		student2.addCourse(course3);
		
		System.out.println(student1.viewCourses());
		System.out.println(course1.viewStudents());
	}
}
class School{
	private String name;
	private List<Student> students;
	School(String name){
		this.name = name;
		this.students = new ArrayList<>();
	}
	public void addStudent(Student student){
		students.add(student);
	}
}
class Student{
	private String name;
	private List<Course> courses;
	Student(String name){
		this.name = name;
		this.courses = new ArrayList<>();
	}
	public void addCourse(Course course){
		courses.add(course);
		course.addStudents(this);
	}
	public String getStudentName(){
		return name;
	}
	public List<String> viewCourses(){
		List<String> courseNames = new ArrayList<>();
		for(Course course : courses)
			courseNames.add(course.getCourseName());
		return courseNames;
	}
}
class Course{
	private String courseName;
	private List<Student> students;
	Course(String courseName){
		this.courseName = courseName;
		this.students = new ArrayList<>();
	}
	public void addStudents(Student student){
		students.add(student);
	}
	public String getCourseName(){
		return courseName;
	}
	public List<String> viewStudents(){
		List<String> studentsName = new ArrayList<>();
		for(Student student : students)
			studentsName.add(student.getStudentName());
		return studentsName;
	}
}