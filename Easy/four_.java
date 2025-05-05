class Student {
    String name;
    int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class four_ {
    public static void main(String[] args) {
        Student std1 = new Student("Bikram", 11);
        std1.displayInfo();
    }
}

