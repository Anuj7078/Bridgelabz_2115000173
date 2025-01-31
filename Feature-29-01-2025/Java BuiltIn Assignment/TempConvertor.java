import java.util.*;

public class TempConvertor {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Choose a conversion option:");
            System.out.println("Fahrenheit to Celsius(F2C)");
            System.out.println("Celsius to Fahrenheit(C2F)");
            System.out.println("Exit(3)");
            System.out.print("Enter your choice: ");
            
            String choice = sc.next();
            
            if (choice.equals("3")) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

            double temp;
            double convertedTemp = 0;

            if (choice.equals("F2C")) {
                temp = Input("Enter temperature in Fahrenheit: ");
                convertedTemp = fahrenheitToCelsius(temp);
                System.out.println(temp + "F is equal to " + convertedTemp + "C.");
            } else if (choice.equals("C2F")) {
                temp = Input("Enter temperature in Celsius: ");
                convertedTemp = celsiusToFahrenheit(temp);
                System.out.println(temp + "C is equal to " + convertedTemp + "F.");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static double Input(String print) {
        System.out.print(print);
        return sc.nextDouble();
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
}
