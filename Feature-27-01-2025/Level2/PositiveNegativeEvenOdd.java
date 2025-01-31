import java.util.*;

public class PositiveNegativeEvenOdd{
	public static boolean isPositive(int num) {
        return num >= 0;
    }
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
	public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];

        System.out.println("Enter 5 Numbers:");
        for (int i = 0; i < num.length; i++) num[i] = sc.nextInt();
		
		for (int i = 0; i < num.length; i++) {
            if (isPositive(num[i])) {
                System.out.print("Number " + num[i] + " is positive and ");
                if (isEven(num[i])) {
                    System.out.println("even.");
                } else {
                    System.out.println("odd.");
                }
            } else {
                System.out.println("Number " + num[i] + " is negative.");
            }
        }
		
		int comparison = compare(num[0], num[num.length - 1]);
        if (comparison == 1) {
            System.out.println("First number is greater than the last number.");
        } else if (comparison == 0) {
            System.out.println("First number is equal to the last number.");
        } else {
            System.out.println("First number is less than the last number.");
        }
	}
}