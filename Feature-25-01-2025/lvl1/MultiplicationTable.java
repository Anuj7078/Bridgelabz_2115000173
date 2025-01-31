import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        sc.close();
        int[] results = new int[10];
        for (int i = 1; i <= 10; i++) {
            results[i - 1] = n * i;
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + (i) + " = " + results[i-1]);
        }
    }
}