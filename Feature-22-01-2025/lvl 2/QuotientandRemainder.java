import java.util.*;

class QuotientandRemainder{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int quotient = a / b;
        int remainder = a % b;
        System.out.println("The Quotient is "+quotient+" and Reminder is "+remainder+ "of two number "+a+" and "+b);
    }
}