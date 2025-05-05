// Class Initialization through Constructor Create a class Book with attributes title and author. Initialize them using a constructor, and print the details using a method showBook().

class Book{
	String title;
	String author;
	public Book(String title,String  author){
		this.title=title;
		this.author=author;
	}
	public void showBook(){
		System.out.println("Title is "+title);
		System.out.println("Author is "+author);
	}
}
public class Seven{
	public static void main(String[] args){
		Book book1=new Book("Hero of the world","Biki");
		book1.showBook();
	}
}
