import java.util.*;

public class NumberChecker5 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number:");
        int n = sc.nextInt();        
        int[] factors = findFactors(n);
        System.out.println("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        System.out.println("Greatest factor: " + findGreatestFactor(factors));
        System.out.println("Sum of factors: " + sumOfFactors(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));
        System.out.println("Product of cubes of factors: " + productOfCubesOfFactors(factors));
        System.out.println("Perfect number: " + isPerfectNumber(n));
        System.out.println("Abundant number: " + isAbundantNumber(n));
        System.out.println("Deficient number: " + isDeficientNumber(n));
        System.out.println("Strong number: " + isStrongNumber(n));
    }

    
    public static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n% i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }


    public static int findGreatestFactor(int[] factors) {
        int greatestFactor = factors[0];
        for (int factor : factors) {
            if (factor > greatestFactor) {
                greatestFactor = factor;
            }
        }
        return greatestFactor;
    }

    
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    
    public static double productOfCubesOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    
    public static boolean isPerfectNumber(int number) {
        int sumOfDivisors = 0;
        int[] factors = findFactors(number);
        for (int factor : factors) {
            if (factor != number) {
                sumOfDivisors += factor;
            }
        }
        return sumOfDivisors == number;
    }

    
    public static boolean isAbundantNumber(int number) {
        int sumOfDivisors = 0;
        int[] factors = findFactors(number);
        for (int factor : factors) {
            if (factor != number) {
                sumOfDivisors += factor;
            }
        }
        return sumOfDivisors > number;
    }

    
    public static boolean isDeficientNumber(int number) {
        int sumOfDivisors = 0;
        int[] factors = findFactors(number);
        for (int factor : factors) {
            if (factor != number) {
                sumOfDivisors += factor;
            }
        }
        return sumOfDivisors < number;
    }

    
    public static boolean isStrongNumber(int number) {
        int originalNumber = number;
        int sumOfFactorials = 0;
        while (number > 0) {
            int digit = number % 10;
            sumOfFactorials += factorial(digit);
            number /= 10;
        }
        return sumOfFactorials == originalNumber;
    }

    
    public static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
