/*
8. E-Commerce Product Catalog

Instructions:

    Base class Product with fields: name, price.
    Method: displayDetails() prints basic info.
    Subclasses:
        Electronics: add warrantyPeriod
        Clothing: add size and material
        Grocery: add expiryDate
    Override displayDetails() to show product-specific info.
    File: ProductCatalog.java.
 */

class Product{
    String  name;
    double price;
    public Product(String name, double price){
        this.name=name;
        this.price=price;
    }
    public void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
    }
}
class Electronics extends Product{
    int warrantyPeriod;
    public Electronics(String name,double price,int warrantyPeriod){
        super(name,price);
        this.warrantyPeriod=warrantyPeriod;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Warranty Period: "+warrantyPeriod);
    }
}
class Clothing extends Product{
    double size;
    String material;
    public Clothing(String name,double price,double size,String material){
        super(name,price);
        this.size=size;
        this.material=material;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Size: "+size+"\nMaterial: "+material);
    }
}
class Grocery extends Product{
    int expiryDate;
    public Grocery(String name,double price,int expiryDate){
        super(name,price);
        this.expiryDate=expiryDate;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Expiry Date: "+expiryDate);
    }
}
class ProductCatalog{
    public static void main(String[] args){
        Electronics e=new Electronics("Mobile",10000,4);
        Clothing c=new Clothing("Pantt",1731,5.4,"Cotton");
        Grocery g=new Grocery("Butter",125,2026);
        e.displayDetails();
        c.displayDetails();
        g.displayDetails();
    }
}