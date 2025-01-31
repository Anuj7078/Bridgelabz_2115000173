import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for a: ");
        int a = sc.nextInt();
        System.out.println("Enter value for b: ");
        int b = sc.nextInt();
        System.out.println("Enter value for c: ");
        int c = sc.nextInt();
        System.out.println("The results of Int Operations are: "+a + b * c+" "+a * b + c+" "+c + a / b+" "+a % b + c);
    }
}
