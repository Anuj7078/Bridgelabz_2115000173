import java.util.*;

public class NumberChecker3{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number:");
        int n = sc.nextInt();

        int[] digits = storeDigits(n);

        System.out.println("Number: " + n);
        System.out.println("Count of digits: " + countDigits(n));

        int[] reversedDigits = reverseDigits(digits);
        System.out.println("Reversed digits: ");
        for (int digit : reversedDigits) {
            System.out.print(digit);
        }
        System.out.println();

        System.out.println("Are original and reversed digits equal? " + compareArrays(digits, reversedDigits));
        System.out.println("Palindrome number: " + isPalindrome(digits));
        System.out.println("Duck number: " + isDuckNumber(digits));
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

    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    public static boolean compareArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int[] digits) {
        int[] reversedDigits = reverseDigits(digits);
        return compareArrays(digits, reversedDigits);
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }
}
