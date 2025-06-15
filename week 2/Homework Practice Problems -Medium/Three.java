// Student Grading (Switch Statement) Create a Student class with name and marks. Write a method calculateGrade() that assigns a grade (A, B, C, D, F) based on marks using a switch or if-else ladder. Create 3 students and display their grades.

class Student{
	String name;
	double marks;
	public Student(String name,double marks){
		this.name=name;
		this.marks=marks;
	}
	public void calculateGrade(){
		if(marks>=90){
			System.out.println("Your Garde is A");
		}else if(marks>=80){
			System.out.println("Your Grade is B");
		}else if(marks>=70){
			System.out.println("Your Grade is C");
		}else if(marks>=60){
			System.out.println("Your Grade is D");
		}else if(marks>=50){
			System.out.println("Your Grade is E");
		}else{
			System.out.println("Your Grade is F");
		}
	}
}

public class Three{
	public static void main(String[] args){
		Student std1=new Student("Bikram",77);
		Student std2=new Student("Bikram 2",87);
		Student std3=new Student("Bikram 3",97);
		std1.calculateGrade();
		std2.calculateGrade();
		std3.calculateGrade();
	}
}


