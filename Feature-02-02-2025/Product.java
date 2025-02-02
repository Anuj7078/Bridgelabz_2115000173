import java.util.*;
public class Product {
    private String productName;
    private double price;
    private static int totalProducts = 0; 

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; 
    }

    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product 1 name:");
        String prod1 = sc.nextLine();
        System.out.println("Enter product 1 price:");
        double price1 = sc.nextDouble();
        sc.nextLine(); 

        System.out.println("Enter product 2 name:");
        String prod2 = sc.nextLine();
        System.out.println("Enter product 2 price:");
        double price2 = sc.nextDouble();

        Product p1 = new Product(prod1, price1);
        Product p2 = new Product(prod2, price2);

        System.out.println("\nProduct 1 Details:");
        p1.displayProductDetails();

        System.out.println("\nProduct 2 Details:");
        p2.displayProductDetails();

        System.out.println();
        Product.displayTotalProducts();
        sc.close();
     }
}
