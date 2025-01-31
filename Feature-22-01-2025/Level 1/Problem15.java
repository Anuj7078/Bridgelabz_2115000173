import java.util.*;

// this program takes the unit price and quantity as input and calculates the total price.
public class Problem15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the unit price");
        int unitPrice = sc.nextInt();
        System.out.println("Enter the quantity");
        int quantity = sc.nextInt();
        int totalPrice = unitPrice * quantity;
        System.out.println("The total price is INR " + totalPrice + " if Quantity is " + quantity
                + " and Unit Price is INR " + unitPrice);
    }
}
