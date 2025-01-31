import java.util.*;
public class YoungestAndTallestAmongThree{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age and height for Amar:");
        int amarAge = sc.nextInt();
        double amarHeight = sc.nextDouble();
        System.out.println("Enter age and height for Akbar:");
        int akbarAge = sc.nextInt();
        double akbarHeight = sc.nextDouble();
        System.out.println("Enter age and height for Anthony:");
        int anthonyAge = sc.nextInt();
        double anthonyHeight = sc.nextDouble();
        sc.close();
        int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        double tallestHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));
        System.out.println("Youngest friend's age: " + youngestAge);
        System.out.println("Tallest friend's height: " + tallestHeight);
    }
}