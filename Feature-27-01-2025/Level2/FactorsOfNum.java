import java.util.Scanner;
public class FactorsOfNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = scanner.nextInt();
        int[] factors = findFactors(num);
        System.out.println("Factors are : ");
        for (int i : factors) {
            System.out.print(i + " ");
        }
        int sum = findSum(factors);
        int product = findProduct(factors);
        int sumOfSquares = findSumOfSquares(factors);
        System.out.println("Sum of factors: " + sum+" Product of factors: " + product+" and Sum of squares of factors: " + sumOfSquares);
    }

    public static int[] findFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int idx = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[idx++] = i;
            }
        }
        return factors;
    }

    public static int findSum(int[] factors) {
        int sum = 0;
        for (int i : factors) sum += i;
        return sum;
    }
    public static int findProduct(int[] factors) {
        int prod = 1;
        for (int factor : factors) prod *= factor;
        return prod;
    }
    public static int findSumOfSquares(int[] factors) {
        int sumOfSquares = 0;
        for (int i : factors) sumOfSquares += Math.pow(i, 2);
        return (int) sumOfSquares;
    }
}
