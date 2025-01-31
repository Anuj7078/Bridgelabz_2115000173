import java.util.Scanner;

public class TemperatureConversion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit: ");
        int fahrenheit = sc.nextInt();
        int celsiusResult = (fahrenheit - 32) * 5 / 9;
        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius");
    }
}
