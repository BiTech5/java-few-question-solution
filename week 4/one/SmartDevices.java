/*1. SmartDevice Hierarchy

Instructions:

    Create a base class SmartDevice with fields: brand, model, and methods turnOn() and turnOff().
    Create subclasses: SmartPhone and SmartWatch.
    Override turnOn() and turnOff() in both subclasses to show device-specific behavior.
    Instantiate devices and call their methods to demonstrate runtime polymorphism.
    File: SmartDevices.java.
*/
class SmartDevice{
    String brand;
    String model;
    public SmartDevice(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    void turnOn(){
        System.out.println("Turnned On");
    }
    void turnOff(){
        System.out.println("Turnned Off");
    }
}
class SmartPhone extends SmartDevice{
    public SmartPhone(String brand,String model){
        super(brand,model);
    }
    @Override
    void  turnOn(){
        System.out.println("Turnning On: "+brand+" "+model);
    }
    @Override
    void  turnOff(){
        System.out.println("Turnning Off: "+brand+" "+model);
    }
}
class SmartWatch extends SmartDevice{
    public SmartWatch(String brand,String model){
        super(brand,model);
    }
    @Override
    void  turnOn(){
        System.out.println("Turnning On smart watch: "+brand+" "+model);
    }
    @Override
    void  turnOff(){
        System.out.println("Turnning Off smart watch: "+brand+" "+model);
    }
}
class SmartDevices{
    public static void main(String [] args){
        SmartDevice phone = new SmartPhone("Samsung", "Galaxy S24");
        SmartDevice watch = new SmartWatch("Apple", "Watch Series 9");

        phone.turnOn();     
        phone.turnOff();    

        watch.turnOn();     
        watch.turnOff();    
    }
}
