import java.util.Scanner;

// this program takes the distance in feet as input and converts it to miles and yards.
public class Problem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in feet:");
        double feet = sc.nextDouble();
        double miles = feet / 5280;
        double yard = feet / 3;
        System.out.println(
                "The distance in feet is " + feet + " which is equal to " + miles + " miles and " + yard + " yards");
    }
}