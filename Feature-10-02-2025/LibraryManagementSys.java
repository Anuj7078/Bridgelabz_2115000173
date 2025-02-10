import java.util.*;
class LibraryManagementSys {
    public static void main(String[] args) {
        List<LibraryItem> list = new ArrayList<>();
        Book book = new Book(1, "Maths", "R.D Sharma");
        Magazine magazine = new Magazine(2, "Tika Badmaash jail se faraar", "Dharmpal");
        DVD dvd = new DVD(3, "Power Ranger", "Saban");
        list.add(book);
        list.add(magazine);
        list.add(dvd);

        for (LibraryItem item : list) {
            item.getItemDetails();
            System.out.println("Loan Time: " + item.getLoanDuration() + " days");
            if (item instanceof Reservable) {
                Reservable reservableItem = (Reservable) item;
                System.out.println("Availability: " + (reservableItem.checkAvailability() ? "Available" : "Not Available"));
                System.out.println(reservableItem.reserveItem());
            }
            System.out.println("**************************");
        }
    }
}
abstract class LibraryItem {
    private int itemId;
    private String title, author;
    LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }
    abstract int getLoanDuration();
    public void getItemDetails() {
        System.out.println("Book ID: " + itemId);
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
    }
}

class Book extends LibraryItem implements Reservable {
    private boolean isReserved;
    Book(int itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }
    int getLoanDuration() {
        return 15;
    }
    public String reserveItem() {
        if (!isReserved) {
            isReserved = true;
            return "Book Reserved successfully!";
        }
        return "Book is Already Reserved.";
    }
    public boolean checkAvailability() {
        return !isReserved;
    }
}
class Magazine extends LibraryItem {
    Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }
    int getLoanDuration() {
        return 20;
    }
}
class DVD extends LibraryItem implements Reservable {
    private boolean isReserved;
    DVD(int itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }
    int getLoanDuration() {
        return 5;
    }
    public String reserveItem() {
        if (!isReserved) {
            isReserved = true;
            return "DVD Reserved successfully!";
        }
        return "DVD is Already Reserved.";
    }
    public boolean checkAvailability() {
        return !isReserved;
    }
}
interface Reservable {
    String reserveItem();
    boolean checkAvailability();
}