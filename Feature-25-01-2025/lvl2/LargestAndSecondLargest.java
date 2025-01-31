
import java.util.Scanner;
public class LargestAndSecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        sc.close();
        int[] digits = new int[10];
        int index = 0, largest = 0, secondLargest = 0;
        while (number > 0) {
            digits[index++] = number % 10;
            number /= 10;
        }
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest) {
                secondLargest = digits[i];
            }
        }
        System.out.println("Largest is "+largest + " and Second Largest " + secondLargest);
    }
}
