import java.util.*;

public class BMI{
	public static void calculateBMI(double[][] Data) {
        for (int i = 0; i < Data.length; i++) {
            double weight = Data[i][0];
            double heightInCm = Data[i][1];
            double heightInM = heightInCm / 100;
            double bmi = weight / (heightInM * heightInM);
            Data[i][2] = bmi;
        }
	}
	public static String[] BMIStatus(double[][] Data) {
        String[] status = new String[Data.length];
        for (int i = 0; i < Data.length; i++) {
            double bmi = Data[i][2];
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obesity";
            }
        }
        return status;
    }
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		double[][] Data = new double[10][3];
		System.out.println("Enter the weight (kg) and height (cm) for 10 team members:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Weight (kg): ");
            Data[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            Data[i][1] = sc.nextDouble();
        }
		
		calculateBMI(Data);
		String[] status = BMIStatus(Data);

        System.out.println("BMI Details:");
        System.out.println("Person | Weight (kg) | Height (cm) | BMI | Status");
        for (int i = 0; i < 10; i++) 
			System.out.print(Data[i][0]+" "+ Data[i][1]+" "+ Data[i][2]+" "+ status[i]);
	}
}