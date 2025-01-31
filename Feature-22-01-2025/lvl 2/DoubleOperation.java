import java.util.Scanner;

public class DoubleOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for a: ");
        double a = sc.nextDouble();
        System.out.println("Enter value for b: ");
        double b = sc.nextDouble();
        System.out.println("Enter value for c: ");
        double c = sc.nextDouble();
        System.out.println("The results of Double Operations are: " + (a + b * c) + " " + (a * b + c) + " " + (c + a / b) + " " + (a % b + c));
    }
}
