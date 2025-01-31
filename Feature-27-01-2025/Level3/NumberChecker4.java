import java.util.*;

public class NumberChecker4{

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number:");
        int n = sc.nextInt();

        System.out.println("Prime number: " + Prime(n));
        System.out.println("Neon number: " + Neon(n));
        System.out.println("Spy number: " + Spy(n));
        System.out.println("Automorphic number: " + Automorphic(n));
        System.out.println("Buzz number: " + Buzz(n));
    }

    public static boolean Prime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean Neon(int n) {
        int square = n * n;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == n;
    }

    public static boolean Spy(int n) {
        int sum = 0;
        int product = 1;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        return sum == product;
    }

    public static boolean Automorphic(int n) {
        int square = n * n;
        return (square % Math.pow(10, countDigits(n))) == n;
    }

    public static boolean Buzz(int n) {
        return (n % 7 == 0 || n % 10 == 7);
    }

    public static int countDigits(int n) {
        return (int) Math.log10(n) + 1;
    }
}
