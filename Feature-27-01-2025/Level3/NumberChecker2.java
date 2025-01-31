import java.util.*;

public class NumberChecker2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number:");
        int n = sc.nextInt();

        int[] digits = storeDigits(n);
        
        System.out.println("Number: " + n);
        System.out.println("Count of digits: " + countDigits(n));
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));
        System.out.println("Harshad Number: " + isHarshadNumber(digits, n));
        
        int[][] freq = findFrequencyOfDigits(digits);
        System.out.println("Frequency of each digit:");
        for (int i = 0; i < freq.length; i++) {
            System.out.println("Digit " + freq[i][0] + ": " + freq[i][1] + " times");
        }
    }

    public static int countDigits(int n) {
        return (int) Math.log10(n) + 1;
    }

    public static int[] storeDigits(int n) {
        int count = countDigits(n);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static double sumOfSquaresOfDigits(int[] digits) {
        double sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    public static boolean isHarshadNumber(int[] digits, int n) {
        int sum = sumOfDigits(digits);
        return n % sum == 0;
    }

    public static int[][] findFrequencyOfDigits(int[] digits) {
        int[][] frequency = new int[10][2];
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]][0] = digits[i];
            frequency[digits[i]][1]++;
        }
        return frequency;
    }
}
