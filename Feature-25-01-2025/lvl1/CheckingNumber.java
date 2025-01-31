import java.util.Scanner;
public class CheckingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }
        sc.close();
        for (int i : numbers) {
            if (i > 0) {
                if (i % 2 == 0) {
                    System.out.println(i + " is positive and even.");
                } else {
                    System.out.println(i + " is positive and odd.");
                }
            } else if (i < 0) {
                System.out.println(i + " is negative.");
            } else {
                System.out.println("Zero");
            }
        }
        if (numbers[0] > numbers[4]) {
            System.out.println("First element is greater than last element.");
        } else if (numbers[0] < numbers[4]) {
            System.out.println("First element is less than last element.");
        } else {
            System.out.println("First and last elements are equal.");
        }
    }
}