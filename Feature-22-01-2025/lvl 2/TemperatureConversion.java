import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius: ");
        int celsius = sc.nextInt();
        int farenheitResult = (celsius * 9/5) + 32;
        System.out.println("The " + celsius + " Celsius is " + farenheitResult + " Fahrenheit");
    }
}
