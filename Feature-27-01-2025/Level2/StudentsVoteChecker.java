import java.util.*;

public class StudentsVoteChecker{
	public static boolean canStudentVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
        int[] studentAges = new int[10];
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter the age of student: ");
            studentAges[i] = sc.nextInt();

            boolean canVote = canStudentVote(studentAges[i]);

            if (canVote) {
                System.out.println("Student can vote.");
            } else if (studentAges[i] < 0) {
                System.out.println("Invalid age entered for Student. Age cannot be negative.");
            } else {
                System.out.println("Student cannot vote.");
            }
        }
	}
}