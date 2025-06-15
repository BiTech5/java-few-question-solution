// Even or Odd Checker Write a Java program that checks if a number (taken as input) is even or odd using an if-else statement.
import java.util.Scanner;
class three{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("ENter a number: ");
        int num=scn.nextInt();
        if(num%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
