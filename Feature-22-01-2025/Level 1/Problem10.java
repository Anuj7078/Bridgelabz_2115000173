import java.util.Scanner;

//this program takes the height in cm as input and converts it to feet and inches.
public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height in Cm:");
        int cm = sc.nextInt();

        int feet = (int) (cm / 30.48);
        int inches = (int) ((cm / 2.54) % 12);

        System.out.println("The height in feet is " + feet + " and inches is " + inches);
    }
}
