import java.util.*;
public class ComputeGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Physics marks:");
        int phy = sc.nextInt();
        System.out.println("Enter Chemistry marks:");
        int chem = sc.nextInt();
        System.out.println("Enter Maths marks:");
        int math = sc.nextInt();
        sc.close();
        double percentage = (phy + chem + math) / 3.0;
        System.out.println("Average Marks:"+percentage);
        if (percentage >= 80) {
            System.out.println("Grade: A");
        } else if (percentage >= 70 && percentage <= 79) {
            System.out.println("Grade: B");
        }else if (percentage >= 60 && percentage <= 69) {
            System.out.println("Grade: C");
        }else if (percentage >= 50 && percentage <= 59) {
            System.out.println("Grade: D");
        }else if (percentage >= 40 && percentage <= 49) {
            System.out.println("Grade: E");
        }else{
            System.out.println("Grade: R");
        }
    }
}
