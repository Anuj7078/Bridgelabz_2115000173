import java.util.*;

class Book {
    String title;
    String author;
    String genre;
    int bookId;
    String availabilityStatus;
    Book next, prev;

    Book(String title, String author, String genre, int bookId, String availabilityStatus) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.availabilityStatus = availabilityStatus;
        this.next = this.prev = null;
    }
}

class Library {
    Book head, tail;

    Library() {
        head = tail = null;
    }

    void addAtBeginning(String title, String author, String genre, int bookId, String availabilityStatus) {
        Book newBook = new Book(title, author, genre, bookId, availabilityStatus);
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
    }

    void addAtEnd(String title, String author, String genre, int bookId, String availabilityStatus) {
        Book newBook = new Book(title, author, genre, bookId, availabilityStatus);
        if (head == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
    }

    void addAtPosition(int position, String title, String author, String genre, int bookId, String availabilityStatus) {
        if (position == 0) {
            addAtBeginning(title, author, genre, bookId, availabilityStatus);
            return;
        }
        Book newBook = new Book(title, author, genre, bookId, availabilityStatus);
        Book temp = head;
        int i = 0;
        while (temp != null && i < position - 1) {
            temp = temp.next;
            i++;
        }
        if (temp == null) {
            System.out.println("Position not found");
        } else {
            newBook.next = temp.next;
            newBook.prev = temp;
            if (temp.next != null) temp.next.prev = newBook;
            temp.next = newBook;
        }
    }

    void remove(int bookId) {
        Book temp = head;
        while (temp != null && temp.bookId != bookId) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Book not found");
            return;
        }
        if (temp == head) head = temp.next;
        if (temp == tail) tail = temp.prev;
        if (temp.prev != null) temp.prev.next = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev;
    }

    void searchByTitle(String title) {
        Book temp = head;
        while (temp != null && !temp.title.equals(title)) {
            temp = temp.next;
        }
        if (temp != null) {
            System.out.println("Book found: " + temp.title + ", " + temp.author + ", " + temp.genre + ", " + temp.bookId + ", " + temp.availabilityStatus);
        } else {
            System.out.println("Book not found");
        }
    }

    void searchByAuthor(String author) {
        Book temp = head;
        while (temp != null && !temp.author.equals(author)) {
            temp = temp.next;
        }
        if (temp != null) {
            System.out.println("Book found: " + temp.title + ", " + temp.author + ", " + temp.genre + ", " + temp.bookId + ", " + temp.availabilityStatus);
        } else {
            System.out.println("Book not found");
        }
    }

    void updateAvailabilityStatus(int bookId, String newStatus) {
        Book temp = head;
        while (temp != null && temp.bookId != bookId) {
            temp = temp.next;
        }
        if (temp != null) {
            temp.availabilityStatus = newStatus;
        } else {
            System.out.println("Book not found");
        }
    }

    void displayForward() {
        Book temp = head;
        while (temp != null) {
            System.out.println("Book Title: " + temp.title + ", Author: " + temp.author + ", Genre: " + temp.genre + ", Book ID: " + temp.bookId + ", Availability: " + temp.availabilityStatus);
            temp = temp.next;
        }
    }

    void displayReverse() {
        Book temp = tail;
        while (temp != null) {
            System.out.println("Book Title: " + temp.title + ", Author: " + temp.author + ", Genre: " + temp.genre + ", Book ID: " + temp.bookId + ", Availability: " + temp.availabilityStatus);
            temp = temp.prev;
        }
    }

    int countBooks() {
        int count = 0;
        Book temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
public class LibraryManagementSys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        library.addAtBeginning("Harry Potter", "J.R.R. Tolkien", "Fantasy", 1, "Available");
        library.addAtEnd("Jungle Book", "George Orwell", "Dystopian", 2, "Checked Out");
        library.addAtPosition(1, "PremChand ke fate jhoote", "Premchand", "Motivational", 3, "Available");

        System.out.println("******Display in forward******");
        library.displayForward();

        System.out.println("******Display in reverse******");
        library.displayReverse();

        System.out.println("Enter Book ID to remove:");
        library.remove(sc.nextInt());

        System.out.println("******After Deletion******");
        library.displayForward();

        System.out.println("Enter Book Title to search:");
        library.searchByTitle(sc.next());

        System.out.println("Enter Author to search:");
        library.searchByAuthor(sc.next());

        System.out.println("Enter Book ID to update Availability:");
        int bookId = sc.nextInt();
        System.out.println("Enter new Availability Status:");
        String status = sc.next();
        library.updateAvailabilityStatus(bookId, status);

        System.out.println("******After Update******");
        library.displayForward();

        System.out.println("Total number of books in library: " + library.countBooks());
    }
}
