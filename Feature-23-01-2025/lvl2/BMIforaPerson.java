import java.util.*;
public class BMIforaPerson{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight(kg):");
        double w = sc.nextDouble();
        System.out.println("Enter height(cm):");
        double h = sc.nextDouble();
        sc.close();
        h = h / 100;
        double bmi = w / (h * h);
        System.out.printf("BMI: %.2f\n", bmi);

        if (bmi < 18.5) {
            System.out.println("Weight Status: Underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Weight Status: Normal weight");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Weight Status: Overweight");
        } else {
            System.out.println("Weight Status: Obesity");
        }
    }
}