// Comparison using if-else Write a Java program that takes two numbers and prints the greater number.
import java.util.Scanner;
public class Six{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter first nbr: ");
		int num1=scn.nextInt();
		System.out.print("Enter second nbr: ");
		int num2=scn.nextInt();
		if(num1>num2){
			System.out.println(num1+" is greater than "+num2);
		}else{
			System.out.println(num2+" is greater than "+num1);
		}
	}
}
