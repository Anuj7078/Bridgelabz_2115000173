import java.util.*;

public class PrimeNumber{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int num = Input("Enter a number to check if it's prime: ");
        
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    public static int Input(String print) {
        System.out.print(print);
        return sc.nextInt();
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) if (num % i == 0) return false;
        return true;
    }
}
