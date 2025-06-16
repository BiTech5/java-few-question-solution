/*
9. Library Management System

Instructions:

    Class LibraryItem with fields: title, author, id.
    Method: getInfo() prints details.
    Subclasses: Book, Magazine, Newspaper override getInfo() to include type-specific info (e.g., publication frequency, issue number).
    Demonstrate a catalog using an array of LibraryItem objects.
    File: LibrarySystem.java.
 */

class LibraryItem{
    String title;
    String author;
    int id;
    public LibraryItem(String title,String author,int id){
        this.title=title;
        this.author=author;
        this.id=id;

    }
    public void getInfo(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Id: "+id);
    }
}
class Book extends LibraryItem{
    String genre;
    public Book(String title,String author,int id,String genre){
        super(title,author,id);
        this.genre=genre;
    }
    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Genre: "+genre);
    }
}

class Magazine extends LibraryItem{
    String category;
    public Magazine(String title,String author,int id,String category){
    super(title,author,id);
        this.category=category;
    }
    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Category: "+category);
    }
}
class NewsPaper extends LibraryItem{
    int date;
    public NewsPaper(String title,String author,int id,int date){
        super(title,author,id);
        this.date=date;
    }
    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Date: "+date);
    }
}
class LibrarySystem{
    public static void main(String[] args){
        LibraryItem[] items=new LibraryItem[3];
        items[0]=new Book("Python DRY","Guido Van Rossum",101,"Programming");
        items[1]=new Magazine("National Geographic","National Geographic Society",102,"Science");
        items[2]=new NewsPaper("The Himalayan Times","The Himalayan Times",103,2025);
        for(LibraryItem item:items){
            item.getInfo();
        }
    }
}