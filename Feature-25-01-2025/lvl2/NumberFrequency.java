
import java.util.Scanner;
public class NumberFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int[] frequency = new int[10];
        while (n > 0) {
            frequency[n % 10]++;
            n /= 10;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Frequency of "+i + " is " + frequency[i]);
        }
        sc.close();
    }
}
