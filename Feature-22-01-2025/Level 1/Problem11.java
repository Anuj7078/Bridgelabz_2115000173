import java.util.Scanner;

//this program takes 2 numbers as input and calculates the addition, subtraction, multiplication, and division of the numbers.
public class Problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float number1 = scanner.nextFloat();

        System.out.print("Enter the second number: ");
        float number2 = scanner.nextFloat();

        float addition = number1 + number2;
        float subtraction = number1 - number2;
        float multiplication = number1 * number2;
        float division = number1 / number2;

        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "
                + number1 + " and " + number2 + " is "
                + addition + ", "
                + subtraction + ", "
                + multiplication + ", and "
                + division);

    }
}
