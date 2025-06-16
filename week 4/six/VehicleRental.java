/*
 6. Vehicle Rental System

Instructions:

    Create base class Vehicle:
        Fields: plateNumber, baseRate
        Method: calculateRental(int days)
    Subclasses:
        Car: charges baseRate * days
        Truck: charges baseRate * days + load fee
        Bike: fixed rate regardless of days
    Override calculateRental() to reflect different pricing models.
    File: VehicleRental.java.
 */

class Vehicle {
    protected int plateNumber;
    protected double baseRate;
    public Vehicle(int plateNumber,double baseRate){
        this.plateNumber=plateNumber;
        this.baseRate=baseRate;
    }
    void calculateRental(int days){
        System.out.println("Total rate: "+(baseRate*days));
    }
}
class Car extends Vehicle {
    public Car(int plateNumber, double baseRate) {
        super(plateNumber, baseRate);
    }
    
    @Override
    void calculateRental(int days) {
        System.out.println("Car rental for " + days + " days: " + (baseRate * days));
    }
}

class Truck extends Vehicle {
    private double loadFee;
    
    public Truck(int plateNumber, double baseRate, double loadFee) {
        super(plateNumber, baseRate);
        this.loadFee = loadFee;
    }
    
    @Override
    void calculateRental(int days) {
        System.out.println("Truck rental for " + days + " days: " + (baseRate * days + loadFee));
    }
}

class Bike extends Vehicle {
    private static final double FIXED_RATE = 50.0;
    
    public Bike(int plateNumber, double baseRate) {
        super(plateNumber, baseRate);
    }
    
    @Override
    void calculateRental(int days) {
        System.out.println("Bike rental: " + FIXED_RATE);
    }
}
class VehicleRental {
    public static void main(String[] args) {
        Vehicle car = new Car(123, 100.0);
        Vehicle truck = new Truck(456, 150.0, 100.0);
        Vehicle bike = new Bike(789, 50.0);
        
        car.calculateRental(3);
        truck.calculateRental(2);
        bike.calculateRental(1);
    }
}