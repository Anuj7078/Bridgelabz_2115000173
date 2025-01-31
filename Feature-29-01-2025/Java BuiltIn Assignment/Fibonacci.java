import java.util.*;
public class Fibonacci{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            int terms = Input("Enter the number of terms: ");
            System.out.println("Fibonacci sequence: ");
            for (int i = 0; i < terms; i++) {
                System.out.print(fibonacci(i) + " ");
            }
            System.out.println();

            System.out.print("Would you like to generate another sequence? (Y/N): ");
            String choice = sc.next();
            if (choice.equals("N")) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }
			else continue;
        }
    }
    public static int Input(String print) {
        System.out.print(print);
        return sc.nextInt();
    }
    public static long fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
