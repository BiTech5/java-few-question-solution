// Employee Bonus Calculation Create a class Employee with name, salary, and yearsOfExperience. Write a method calculateBonus():
// If experience > 5 years, bonus = 20% of salary Otherwise, bonus = 10% of salary Display the bonus amount for each employee.

class Employee{
	String name;
	double salary;
	int yearsOfExperience;
	public Employee(String name,double salary, int yearsOfExperience){
		this.name=name;
		this.salary=salary;
		this.yearsOfExperience=yearsOfExperience;
	}
	public void calculateBonus(){
		if (yearsOfExperience>5){
			double bonus=(salary)*0.2;
			System.out.println(name+" bonus is "+bonus);
		}else{
			double bonus=(salary)*0.1;
			System.out.println(name+" bonus is "+bonus);
		}
	}
}
public class Six{
	public static void main(String[] args){
		Employee emp1=new Employee("Bikram",2222.14,2002);
		emp1.calculateBonus();
	}
}
