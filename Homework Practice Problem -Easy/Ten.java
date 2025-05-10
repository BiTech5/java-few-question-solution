// Create Multiple Objects Create a class Car with attributes brand and year. Create two Car objects in the main method and display their details.
class Car{
	String brand;
	int year;
	public Car(String brand,int year){
		this.brand=brand;
		this.year=year;
	}
	public void displayDetails(){
		System.out.println("Brand: "+brand+"\nYear: "+year);
	}
}

public class Ten{
	public static void main(String[] args){
		Car biki_car=new Car("Toyota",2000);
		Car bikram_car=new Car("Tesla",2010);
		biki_car.displayDetails();
		bikram_car.displayDetails();
	}
}
	
