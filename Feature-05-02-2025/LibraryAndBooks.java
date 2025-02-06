import java.util.*;
class LibraryAndBooks{
	public static void main(String[]args){
		Book book1 = new Book("Mathematics","R.D. SHARMA");
		Book book2 = new Book("Flamingo","Arvind Adiga");
		
		Library lib1 = new Library();
		lib1.addBook(book1);
		lib1.addBook(book2);
		
		lib1.displayBooks();
	}
}
class Book{
	private String title, author;
	Book(String title, String author){
		this.title = title;
		this.author = author;
	}
	
	public String getTitle(){
		return title;
	}
	public String getAuthor(){
		return author;
	}
}

class Library{
	private List<Book> books;
	Library(){
		this.books = new ArrayList<>();
	}
	public void addBook(Book book){
		books.add(book);
	}
	public void displayBooks(){
		for(Book b : books){
			System.out.println("Title: "+b.getTitle()+" Author: "+b.getAuthor());
		}
	}
}