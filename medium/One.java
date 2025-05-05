// Book Library (Manual Objects) Create a Book class with attributes: title, author, ISBN. In the main() method, create 5 different Book objects manually and display their details using a method showDetails().

class Book{
	String title;
	String author;
	int isbn;
	public Book(String title,String author,int isbn){
		this.title=title;
		this.author=author;
		this.isbn=isbn;
	}
	public void showDetails(){
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println("Isbn: "+isbn);
	}
}

public class One{
	public static void main(String[] args){
		Book book1=new Book("BikiTheWorld","BIki",2222);
		Book book2=new Book("THeWOrld","Biki2",2121);
		Book book3=new Book("HIi","BIki3",333);
		Book book4=new Book("Hello","Biki4",666);
		Book book5=new Book("HelloWorld","BIki5",7777);
		book1.showDetails();
		book2.showDetails();
		book3.showDetails();
		book4.showDetails();
		book5.showDetails();
	}
}
