/*Instructions:

    Class Student with private fields: name, rollNumber, marks[].
    Encapsulate with getters/setters.
    Method calculateAverage() returns average marks.
    Subclass GraduateStudent adds thesisTopic and a method printThesisTitle().
    Demonstrate both types of students.
    File: GradeBook.java.
*/

class Student {
    private String name;
    private int rollNumber;
    private int[] marks;
    
    public Student(String name, int rollNumber, int[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int[] getMarks() {
        return marks;
    }
    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public double calculateAverage() {
        int sum = 0;
        for (int mark : marks) { 
            sum += mark;
        }
        return sum / marks.length;
    }
}

class GraduateStudent extends Student {
    private String thesisTopic;
    
    public GraduateStudent(String name, int rollNumber, int[] marks, String thesisTopic) {
        super(name, rollNumber, marks);
        this.thesisTopic = thesisTopic;
    }

    public String getThesisTopic() {
        return thesisTopic;
    }

    public void printThesisTitle() {
        System.out.println("Thesis Title: " + thesisTopic);
    }
}

class GradeBook {
    public static void main(String[] args) {
        int[] marks = {85, 90, 78, 92, 88};
        Student student = new Student("Biki", 12345, marks);
        System.out.println("Student Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNumber());
        System.out.println("Average Marks: " + student.calculateAverage());

        GraduateStudent graduate = new GraduateStudent("Ramm", 54321, marks, "Artificial Intelligence");
        System.out.println("Graduate Student Name: " + graduate.getName());
        System.out.println("Roll Number: " + graduate.getRollNumber());     
        System.out.println("Average Marks: " + graduate.calculateAverage());
        graduate.printThesisTitle();
    }
}