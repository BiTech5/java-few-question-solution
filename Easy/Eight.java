// Simple Calculator (if-else) Write a Java program that asks the user to enter two numbers and an operator (+, -, *, /) and then calculates the result based on the operator using if-else statements.
import java.util.Scanner;
public class Eight{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num1=scn.nextInt();
		System.out.print("Enter second number: ");
                int num2=scn.nextInt();

		System.out.print("Enter operator(+,/,-,*): ");
		char operator=scn.next().charAt(0);
		if(operator=='+'){
			System.out.println(num1+num2);
		}else if(operator=='-'){
			System.out.println(num1-num2);
		}else if(operator=='*'){
			System.out.println(num1*num2);
		}else if(operator=='/'){
			System.out.println(num1/num2);
		}else{
			System.out.println("Error");
		}
	}
}

