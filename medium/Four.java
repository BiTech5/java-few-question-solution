// Rectangle and Area Calculation Create a class Rectangle with length and width. Initialize using a constructor. Create a method calculateArea() that returns the area. Create 3 rectangles of different dimensions and display their areas.

class Rectangle{
	double length;
	double width;
	public Rectangle(double length,double width){
		this.length=length;
		this.width=width;
	}
	public double calculateArea(){
		return length*width;
	}
}

public class Four{
	public static void main(String[] args){
		Rectangle rect1=new Rectangle(4,8);
		Rectangle rect2=new Rectangle(5,6);
		Rectangle rect3=new Rectangle(6,1);
		System.out.println(rect1.calculateArea());
		System.out.println(rect2.calculateArea());
		System.out.println(rect3.calculateArea());
	}
}
