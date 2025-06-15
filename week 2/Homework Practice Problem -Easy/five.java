// Use of Logical Operators Write a Java program to check if a person is eligible to vote. (The person must be 18 or older and a citizen.)
import java.util.Scanner;
public class five {
    public static void main(String[] args) {
    	Scanner scn=new Scanner(System.in);
	System.out.print("Enter your age: ");
	int age=scn.nextInt();
	System.out.print("Are you a citizen? (true/false): ");
	boolean citizen=scn.nextBoolean();
	if(age>=18 && citizen){
		System.out.println("You are eligible to vote");
	}
	else{
		System.out.println("You are not eligible to vote");
	}
	scn.close();
    }
}
