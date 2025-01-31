import java.util.*;

public class BasicCalculator{
    static Scanner sc= new Scanner(System.in);
	
    public static void main(String[] args) {
        System.out.println("Welcome to the Basic Calculator!");
        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("Addition (+)");
            System.out.println("Subtraction (-)");
            System.out.println("Multiplication (*)");
            System.out.println("Division (/)");
            System.out.println("Exit(5)");
            System.out.print("Enter your choice: ");

            char operator = sc.next().charAt(0);

            if (operator == '5') {
                System.out.println("Exiting calculator. Goodbye!");
                break;
            }

            double num1 = Input("Enter first number: ");
            double num2 = Input("Enter second number: ");
            double ans = 0;

            switch (operator) {
                case '+':
                    ans = add(num1, num2);
                    break;
                case '-':
                    ans = subtract(num1, num2);
                    break;
                case '*':
                    ans = multiply(num1, num2);
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                        continue;
                    }
                    ans = divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }

            System.out.println("Result: " + ans);
            System.out.println();
        }
    }

    public static double Input(String print) {
        System.out.print(print);
        return sc.nextDouble();
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }
}
