// Positive, Negative or Zero Write a Java program that takes a number and prints whether the number is positive, negative, or zero.
import java.util.Scanner;
public class Nine{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=scn.nextInt();
		if(num>0){
			System.out.println("It is positive");
		}else if(num==0){
			System.out.println("It is qual to zero");
		}else{
			System.out.println("It is negative number");
		}
	}
}
