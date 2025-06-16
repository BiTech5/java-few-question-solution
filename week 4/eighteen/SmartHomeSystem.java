/*
18. Smart Home Automation

Instructions:

    Class Device: field deviceName, method operate()
    Subclasses:
        Light: operate() turns on light
        Thermostat: operate() sets temperature
        SecurityCamera: operate() starts recording
    Demonstrate polymorphism using a Device[] list.
    File: SmartHomeSystem.java.

*/

class Device {
    protected String deviceName;
    
    public Device(String deviceName) {
        this.deviceName = deviceName;
    }
    
    public void operate() {
        System.out.println("Operating " + deviceName);
    }
}

class Light extends Device {
    public Light(String deviceName) {
        super(deviceName);
    }
    
    @Override
    public void operate() {
        System.out.println("Turning on " + deviceName);
    }
}

class Thermostat extends Device {
    private int temperature;
    
    public Thermostat(String deviceName, int temperature) {
        super(deviceName);
        this.temperature = temperature;
    }
    
    @Override
    public void operate() {
        System.out.println("Setting " + deviceName + " to " + temperature + "°C");
    }
}

class SecurityCamera extends Device {
    public SecurityCamera(String deviceName) {
        super(deviceName);
    }
    
    @Override
    public void operate() {
        System.out.println("Starting recording on " + deviceName);
    }
}

class SmartHomeSystem {
    public static void main(String[] args) {
        Device[] devices = new Device[3];
        devices[0] = new Light("Living Room Light");
        devices[1] = new Thermostat("Main Thermostat", 22);
        devices[2] = new SecurityCamera("Front Door Camera");
        
        System.out.println("Smart Home System:");
        for (Device device : devices) {
            device.operate();
            System.out.println();
        }
    }
}
