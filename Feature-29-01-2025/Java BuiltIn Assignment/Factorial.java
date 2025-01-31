import java.util.*;

public class Factorial{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            int num = Input("Enter a Number: ");
            long factorial = calculateFactorial(num);
            System.out.println("The factorial of " + num + " is: " + factorial);
        }
    }
    public static int Input(String print) {
        System.out.print(print);
        return sc.nextInt();
    }
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
