package uk.co.willworth.number;

import java.util.Scanner;
/**
 * Created by Will on 09-May-16.
 */
public class Fibonacci {
    public static void main (String[] args) {
        System.out.println("Welcome to the Fibonacci sequence producer.");
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("How many Fibonacci numbers would you like to print?");
        int quant = inputScanner.nextInt();
        //Catch error input as this will only work for
        // first 45 numbers of Fibonacci as I'm using int.


        if (quant >= 45) {
            System.out.println("Sorry! This dummy program only runs as high as the first");
            System.out.println("45 integers of the fibonacci sequence.  Try again!");
        } else {
            System.out.println("You have requested the first " + quant + " numbers of the sequence.");
            int count;


            int a = 0;
            int b = 1;
            for (count = 1; count <= quant; count = count + 1) {
                System.out.println("the count is now " + count);

                int result = a + b;
                System.out.println("Fib number " + count + " is " + result);
                a = b;
                b = result;

            }


        }
    }
}
