import java.util.*;
class UniversityManagementSys {
    public static void main(String[] args) {
        Professor prof1 = new Professor("M.S. Dhoni");
        Professor prof2 = new Professor("Sachin Tendulkar");

        Course course1 = new Course("DBMS");
        Course course2 = new Course("OS");

        course1.assignProfessor(prof1);
        course2.assignProfessor(prof2);

        Student student1 = new Student("Anuj");
        Student student2 = new Student("Kunal");

        student1.enrollCourse(course1);
        student2.enrollCourse(course2);

        student1.viewEnrolledCourses();
        student2.viewEnrolledCourses();

        course1.viewCourseDetails();
        course2.viewCourseDetails();
    }
}
class Student {
    private String name;
    private List<Course> enrolledCourses;

    Student(String name) {
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
        course.addStudent(this);
    }

    public void viewEnrolledCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course course : enrolledCourses) {
            System.out.println(course.getCourseName());
        }
    }

    public String getStudentName() {
        return name;
    }
}
class Professor {
    private String name;

    Professor(String name) {
        this.name = name;
    }

    public String getProfessorName() {
        return name;
    }
}
class Course {
    private String courseName;
    private Professor professor;
    private List<Student> students;

    Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }
    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public void viewCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Professor: " + (professor != null ? professor.getProfessorName() : "Not Assigned"));
        System.out.println("Enrolled Students:");
        for (Student student : students) {
            System.out.println(student.getStudentName());
        }
    }
    public String getCourseName() {
        return courseName;
    }
}
