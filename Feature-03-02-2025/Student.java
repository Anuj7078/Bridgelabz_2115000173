import java.util.*;

public class Student {
    private static String universityName = "GLA University";
    private static int studentCount = 0;
    private final int rollNumber;
    private String name;
    private String grade;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        studentCount++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students in University: " + studentCount);
    }

    public void displayStudent() {
        System.out.println("University Name: " + universityName);
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + (i + 1) + " student name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Enter the " + (i + 1) + " student roll number: ");
            int rollNumber = sc.nextInt();
            System.out.println("Enter the " + (i + 1) + " student grade: ");
            sc.nextLine();
            String grade = sc.nextLine();

            students[i] = new Student(name, rollNumber, grade);
        }

        System.out.println("Total Students Registered: " + studentCount);
        System.out.println("Enter Roll Number to display details: ");
        int searchId = sc.nextInt();
        boolean flag = false;

        for (Student student : students) {
            if (student.getRollNumber() == searchId) {
                System.out.println("Student Details:");
                student.displayStudent();
                flag = true;
                break;
            }
        }

        if (!flag) {
            System.out.println("Student with Roll Number " + searchId + " not found.");
        }

        sc.close();
    }
}
