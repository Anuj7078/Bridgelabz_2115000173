import java.util.*;
public class Course{
    private String courseName;
    private double duration;
    private double fee;
    private static String instituteName="college"; 

    public Course(String courseName, double duration, double fees) {
        this.courseName=courseName;
        this.duration=duration;
        this.fee=fee;
    }
    public void displayCourseDetails(){
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: $" + fee);
        System.out.println("-------------------------");
    }
    public static void updateInstituteName(String newName){
        instituteName=newName;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Course 1 Name:");
        String course1Name = sc.nextLine();
        System.out.println("Enter Course 1 Duration (in weeks):");
        int duration1 = sc.nextInt();
        System.out.println("Enter Course 1 Fee:");
        double fee1 = sc.nextDouble();
        sc.nextLine(); 

        System.out.println("Enter Course 2 Name:");
        String course2Name = sc.nextLine();
        System.out.println("Enter Course 2 Duration (in weeks):");
        int duration2 = sc.nextInt();
        System.out.println("Enter Course 2 Fee:");
        double fee2 = sc.nextDouble();
        sc.nextLine(); 

        Course course1 = new Course(course1Name, duration1, fee1);
        Course course2 = new Course(course2Name, duration2, fee2);
        System.out.println("\nInitial Course Details:");
        course1.displayCourseDetails();
        course2.displayCourseDetails();

        System.out.println("Enter new Institute Name:");
        String newInstituteName = sc.nextLine();
        Course.updateInstituteName(newInstituteName);

        System.out.println("\nCourse Details After Updating Institute Name:");
        course1.displayCourseDetails();
        course2.displayCourseDetails();
        sc.close();
     }
}

