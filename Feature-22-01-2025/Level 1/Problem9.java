import java.util.Scanner;

//this program takes the course price and discount percentage as input and calculates the discount amount and final price.
public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the course price:");
        int coursePrice = sc.nextInt();
        System.out.println("Enter the discount percentage:");
        int discount = sc.nextInt();
        int discountAmount = (coursePrice * discount) / 100;
        int finalPrice = coursePrice - discountAmount;
        System.out.println(
                "The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalPrice);
    }
}
