package uk.co.willworth.number;
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args){
        System.out.println("Welcome to the odd even tester!");
        System.out.println("Enter a number and I will tell you");
        System.out.println("whether it is odd or even.");
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        int x = inputScanner.nextInt();
        inputScanner.nextLine();
        System.out.println("You entered " + x);
        inputScanner.nextLine();
        if (x%2==0){
            System.out.println("Your number is even.");
        }else {
            System.out.println("Your number is odd.");
        }
    }
}
