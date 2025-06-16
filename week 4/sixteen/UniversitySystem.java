/*
16. University People System

Instructions:

    Base class Person: private fields name, id, and method getRoleDetails()
    Subclasses:
        Student: add program
        Teacher: add subject
        Admin: add department
    Override getRoleDetails() to show respective info.
    File: UniversitySystem.java.

 */

class Person{
    private String name;
    private int id;
    public Person(String name,int id){
        this.name=name;
        this.id=id;
    }
    void getRoleDetails(){
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
    }
}

class Student extends Person{
    private String program;
    public Student(String name,int id,String program){
        super(name,id);
        this.program=program;
    }
    @Override
    void getRoleDetails(){
        super.getRoleDetails();
        System.out.println("Program: "+program);
    }
}

class Teacher extends Person{
    private String subject;
    public Teacher(String name,int id,String subject){
        super(name,id);
        this.subject=subject;
    }
    @Override
    void getRoleDetails(){
        super.getRoleDetails();
        System.out.println("Subject: "+subject);
    }
}
class Admin extends Person{
    private String department;
    public Admin(String name,int id,String department){
        super(name,id);
        this.department=department;
    }
    @Override
    void getRoleDetails(){
        super.getRoleDetails();
        System.out.println("Department: "+department);
    }
}

class UniversitySystem{
    public static void main(String[] args){
    Person[] people = new Person[3];
    people[0] = new Student("Shiva", 1001, "Computer Science");
    people[1] = new Teacher("Ishwor", 2001, "Mathematics");
    people[2] = new Admin("Mina", 3001, "IT Department");
    
    System.out.println("University System Information:");
    for (Person person : people) {
        person.getRoleDetails();
        System.out.println();
    }
    }
}