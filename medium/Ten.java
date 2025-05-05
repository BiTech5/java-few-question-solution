// Manual Car Showroom Inventory Create a Car class with attributes: brand, model, price. Create 5 different Car objects with different details. Display the cars whose price is greater than 20,00,000 (use if statement).

class Car {
    String brand;
    String model;
    int price;

     public  Car(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public  void display() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: Rs." + price);
    }
}

public class Ten {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Fortuner", 4200000);
        Car car2 = new Car("Maruti", "Swift", 800000);
        Car car3 = new Car("BMW", "X5", 9200000);
        Car car4 = new Car("Hyundai", "Creta", 1700000);
        Car car5 = new Car("Audi", "A6", 6300000);

        Car[] cars = {car1, car2, car3, car4, car5};

        System.out.println("Cars with price greater than Rs.20,00,000:\n");

        for (Car car : cars) {
            if (car.price > 2000000) {
                car.display();
            }
        }
    }
}

