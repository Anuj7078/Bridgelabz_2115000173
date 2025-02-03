import java.util.*;
public class Book {
    private static String libraryName = "Samaj kalyan";
    private  static String Title;
    private static String Author;
    private final int ISBN;

    public Book(String Title, String Author, int ISBN){
        this.Title = Title;
        this.Author = Author;
        this.ISBN = ISBN;
    }
    public static void displayLibraryName(){
        System.out.println("Library Name is " + libraryName);
    }
    public void displayDetails(){
        if (this instanceof Book) {
            System.out.println("Title: " + Title);
            System.out.println("Author: " + Author);
            System.out.println("ISBN: " + ISBN);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter book details: ");

        System.out.print("Enter book title: ");
        String title = sc.nextLine();

        System.out.print("Enter book author: ");
        String author = sc.nextLine();

        System.out.print("Enter book ISBN: ");
        int isbn = sc.nextInt();
        
        Book book = new Book(title, author, isbn);
        displayLibraryName();
        if(book instanceof Book){
            System.out.println("Book details are: ");
            book.displayDetails();
        }else{
            System.out.println("This obj is not an instance of Book");
        }
        sc.close();
    }
}
