import java.util.*;
public class Product {
    private static int discount = 20;
    private final int productID;
    private static String productName;
    private static int price;
    private static int quantity;

    public Product(int productID, String productName, int price, int quantity){
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    public static void updateDiscount(int newDiscount){
        discount = newDiscount;
    }
    public void display(){
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product ID: ");
        int productID = sc.nextInt();
        sc.nextLine(); 
        
        System.out.print("Enter product name: ");
        String productName = sc.nextLine();
        System.out.print("Enter price: ");
        int price = sc.nextInt();
        
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        Product product = new Product(productID, productName, price, quantity);
        if( product instanceof Product){
            System.out.println("Product details are: ");
            product.display();
        }else{
            System.out.println("This obj is not an instance of Product");
        }
        System.out.println("Enter new discount: ");
        int newDiscount = sc.nextInt();
        Product.updateDiscount(newDiscount);
        product.display();
        sc.close();
    }
}
