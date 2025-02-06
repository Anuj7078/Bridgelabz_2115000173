import java.util.*;
class CustomersAndProducts {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Bhagyodaya");
        Customer customer2 = new Customer("Vansh");
        Product product1 = new Product("Laptop", 60000);
        Product product2 = new Product("Smartphone", 30000);
        Product product3 = new Product("Headphone", 5000);

        Order order1 = new Order(101, customer1);
        order1.addProduct(product1);
        order1.addProduct(product2);
        customer1.placeOrder(order1);

        Order order2 = new Order(102, customer1);
        order2.addProduct(product3);
        customer1.placeOrder(order2);

        Order order3 = new Order(103, customer2);
        order3.addProduct(product2);
        order3.addProduct(product3);
        customer2.placeOrder(order3);

        customer1.viewOrders();
        customer2.viewOrders();
    }
}

class Customer {
    private String customerName;
    private List<Order> orders;

    Customer(String customerName) {
        this.customerName = customerName;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public void viewOrders() {
        System.out.println("Orders placed by " + customerName + ":");
        for (Order order : orders) {
            order.viewOrderDetails();
        }
    }

    public String getCustomerName() {
        return customerName;
    }
}
class Order {
    private int orderId;
    private Customer customer;  // Association with Customer
    private List<Product> products;

    Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
    }
    public void addProduct(Product product) {
        products.add(product);
    }
    public void viewOrderDetails() {
        System.out.println("Order ID: " + orderId + " | Placed by: " + customer.getCustomerName());
        System.out.println("Products in this order:");
        for (Product product : products) {
            System.out.println("- " + product.getProductName() + "(" + product.getProductPrice() + "Rs.)");
        }
    }
}
class Product {
    private String productName;
    private int productPrice;
    Product(String productName, int productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }
    public String getProductName() {
        return productName;
    }
    public int getProductPrice() {
        return productPrice;
    }
}
