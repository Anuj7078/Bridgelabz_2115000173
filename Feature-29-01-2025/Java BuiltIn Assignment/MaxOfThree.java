import java.util.*;

public class MaxOfThree {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter three integers:");
        
        int num1 = Input("First number: ");
        int num2 = Input("Second number: ");
        int num3 = Input("Third number: ");

        int maxNum = Max(num1, num2, num3);
        System.out.println("The maximum number is: " + maxNum);
    }

    public static int Input(String a) {
        System.out.print(a);
        return sc.nextInt();
    }

    public static int Max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
