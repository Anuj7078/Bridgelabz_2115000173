import java.util.*;
public class HandleBookDetails{
	private String BookTitle, BookAuthor;
	private int BookPrice;
	Book(String Title, String Author, int Price){
		BookTitle = Title;
		BookAuthor = Author;
		BookPrice = Price;
	}
	private void displayDetails(){
		System.out.println("Book Title: "+BookTitle);
		System.out.println("Book Author: "+BookAuthor);
		System.out.println("Book Price: "+BookPrice+"Rs");
	}
	private void setDetails(String BookTitle, String BookAuthor, int BookPrice){
		this.BookTitle = BookTitle;
		this.BookAuthor = BookAuthor;
		this.BookPrice = BookPrice;
	}
	
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Book Title: ");
		String bookTitle = sc.nextLine();
		System.out.print("Enter the Book Auhtor: ");
		String bookAuhtor = sc.nextLine();
		System.out.print("Enter the Book Price: ");
		int bookPrice = sc.nextInt();
		
		Book book = new Book(bookTitle,bookAuhtor,bookPrice);
		book.displayDetails();
		book.setDetails("Physics","HC Verma",10);
		book.displayDetails();
		sc.close();
	}
}