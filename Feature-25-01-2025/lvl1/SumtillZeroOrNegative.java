import java.util.Scanner;
public class SumtillZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        double sum = 0.0;
        int index = 0;
        while (true) {
            double num = sc.nextDouble();
            if (num <= 0 || index == 10) {
                break;
            }
            numbers[index++] = num;
        }
        sc.close();
        for (int i = 0; i < index; i++) {
            sum += numbers[i];
        }
        System.out.println("Total: " + sum);
    }
}