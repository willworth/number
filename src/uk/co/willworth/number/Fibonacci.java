package uk.co.willworth.number;

import java.util.Scanner;
/**
 * Created by Will on 09-May-16.
 */
public class Fibonacci {
    public static void main (String[] args){
        System.out.println("Welcome to the Fibonacci sequence producer.");
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("How many Fibonacci numbers would you like to print?");
        int quant = inputScanner.nextInt();
        System.out.println("You have requested the first " + quant + " numbers of the sequence.");
        int count;
        for (count = 0; count <= quant; count = count+1) {
            System.out.println("the count is now " + count);
           // int first = 0;
           // int second = 1;
        }






    }
}
