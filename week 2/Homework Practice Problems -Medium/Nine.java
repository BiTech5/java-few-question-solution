// Constants Usage Example Create a Circle class with an attribute radius. Use a final constant PI = 3.14159. Write a method calculateCircumference() and calculateArea() using PI. Create two Circle objects and display their area and circumference.

class Circle{
	public static final double pi=3.14159;
	public double radius;
	public Circle (double radius){
		this.radius=radius;
	}
	public double calculateCircumference(){
		return 2*pi*radius;
	}
	public double calculateArea(){
		return pi*radius*radius;
	}
}

public class Nine{
	public static void main(String[] main){
		Circle circle1=new Circle(7);
		Circle circle2=new Circle(8);
		System.out.println("Circumference: "+circle1.calculateCircumference()+"\nArea: "+circle1.calculateArea());
		System.out.println("Circumference: "+circle2.calculateCircumference()+"\nArea: "+circle2.calculateArea());
	}
}
