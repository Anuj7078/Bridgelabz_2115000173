class Course {
    String courseName;
    int duration;
    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
    void displayDetails() {
        System.out.println("Your Course is " + courseName + " and Duration is " + duration + " weeks");
    }
}
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;
    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println("Platform: " + platform + " and  Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;
    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println("Fee: $" + fee + " and Discount: " + discount + "%");
    }
}
public class EducationalCourse {
    public static void main(String[] args) {
        PaidOnlineCourse course1 = new PaidOnlineCourse("DSA", 6, "Udemy", true, 2000, 15);
        PaidOnlineCourse course2 = new PaidOnlineCourse("Cloud Computing", 4, "Coursea", true, 1000, 7);
        course1.displayDetails();
        course2.displayDetails();
    }
}
