import java.util.*;
public class OnlineMarketplace{
    public static void main(String[] args) {
        ProductCatalog<BookCategory> bC = new ProductCatalog<>();
        ProductCatalog<ClothingCategory> cC = new ProductCatalog<>();

        BookCategory story = new BookCategory("Story");
        ClothingCategory menWear = new ClothingCategory("Men's Wear");

        Product<BookCategory> book = new Product<>("You can't see me", 500, story);
        Product<ClothingCategory> shirt = new Product<>("T-Shirt", 2000, menWear);

        bC.addProduct(book);
        cC.addProduct(shirt);

        bC.applyDiscount(book, 15);
        cC.applyDiscount(shirt, 25);

        bC.displayProducts();
        cC.displayProducts();
    }
}
class BookCategory {
    String type;
    BookCategory(String type){
		this.type = type;
	}
}
class ClothingCategory {
    String type;
    ClothingCategory(String type){
		this.type = type;
	}
}
class GadgetCategory {
    String type;
    GadgetCategory(String type){
		this.type = type;
	}
}
class Product<T> {
    String name;
    double price;
    T category;

    Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    void applyDiscount(double percentage) {
        price -= price * (percentage / 100);
    }
}
class ProductCatalog<T> {
    List<Product<T>> products = new ArrayList<>();

    void addProduct(Product<T> product) {
        products.add(product);
    }

    void applyDiscount(Product<T> product, double percentage) {
        product.applyDiscount(percentage);
    }

    void displayProducts() {
        for (Product<T> product : products) {
            System.out.println(product.name + " -> " + product.price+" Rs.");
        }
    }
}

