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
    private int plateNumber;
    private double baseRate;
    public Vehicle(int plateNumber,double baseRate){
        this.plateNumber=plateNumber;
        this.baseRate=baseRate;
    }
    void calculateRental(int days){
        System.out.println("Total rate: "+(baseRate*days));
    }
}
class Car extends Vehicle{
    
}
class Truck extends Vehicle{

}
class Bike extends Vehicle{

}