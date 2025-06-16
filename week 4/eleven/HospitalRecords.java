/*
11. Hospital Patient Records

Instructions:

    Class Patient: private fields name, age, and method getTreatmentPlan()
    Subclasses:
        InPatient: add roomNumber, override getTreatmentPlan() with full plan
        OutPatient: add appointmentDate, override getTreatmentPlan() accordingly
    Use encapsulation for all fields
    File: HospitalRecords.java.
*/
class Patient {
    private String name;
    private int age;
    
    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Getters
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    // Setters
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void getTreatmentPlan() {
        System.out.println("Giving Treatment to: " + getName() + "\nAge: " + getAge());
    }
}

class InPatient extends Patient{
    private int roomNumber;
    public InPatient(String name,int age,int roomNumber){
        super(name,age);
        this.roomNumber=roomNumber;
    }

    @Override
    public void getTreatmentPlan() {
        super.getTreatmentPlan();
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Full Treatment Plan: Daily monitoring, medication, and rest in hospital");
    }
}

class OutPatient extends Patient{
    int appointmentDate;
    public OutPatient(String name,int age,int appointmentDate){
        super(name,age);
        this.appointmentDate=appointmentDate;
    }

    @Override
    public void getTreatmentPlan() {
        super.getTreatmentPlan();
        System.out.println("Appointment Date: " + appointmentDate);
        System.out.println("Treatment Plan: Regular check-ups and medication at home");
    }
}
class HospitalRecords{
    public static void main(String[] ags){
    Patient[] patients = new Patient[2];
    patients[0] = new InPatient("Radhe Krishne", 45, 101);
    patients[1] = new OutPatient("Harrii Ram", 32, 20);
    
    System.out.println("Hospital Patient Records:");
    for (Patient patient : patients) {
        patient.getTreatmentPlan();
    }
    }
}