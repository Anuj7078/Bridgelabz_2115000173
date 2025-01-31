
import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of persons:");
        int n = sc.nextInt();
        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter height of person :");
            height[i] = sc.nextDouble();
            System.out.println("Enter weight of person :");
            weight[i] = sc.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);
            status[i] = bmi[i] <= 18.4 ? "Underweight" : bmi[i] <= 24.9 ? "Normal" : bmi[i] <= 39.9 ? "Overweight" : "Obese";
            System.out.println("Height = "+height[i] + " Weight = " + weight[i] + " BMI = " + bmi[i] + " and Status = " + status[i]);
        }
        sc.close();
    }
}
