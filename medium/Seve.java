// Product Discount Calculator Create a class Product with productName, price, and discountPercentage. Write a method calculateFinalPrice() which returns price after discount. Create 3 different products and print their final prices.


class Product{
	String productName;
	double price;
	double discountPercentage;
	public Product(String productName,double price,double discountPercentage){
		this.productName=productName;
		this.price=price;
		this.discountPercentage=discountPercentage;
	}
	public double calculateFinalPrice(){
		double discount=price*discountPercentage/100;
		return price-discount;
	}
}
public class Seve{
	public static void main(String[] args){
		Product pro1=new Product("Daraz",20000,5);
		Product pro2=new Product("Daraz 1",30000,5);
		Product pro3=new Product("Daraz 2",40000,5);
		System.out.println("Final Price "+pro1.calculateFinalPrice());
		System.out.println("Final Price "+pro2.calculateFinalPrice());
		System.out.println("Final Price "+pro3.calculateFinalPrice());

	}
}
