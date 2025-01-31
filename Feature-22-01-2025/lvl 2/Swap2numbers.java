import java.util.*;
public class Swap2numbers {
    public static void main(String[] args) {
        // Hello teachers ive used xor method because this is space efficient method.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("The swapped numbers are "+a+" and "+b);
    }
}
