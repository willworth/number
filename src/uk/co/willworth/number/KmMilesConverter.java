package uk.co.willworth.number;
import java.util.Scanner;
/**
 * 1 km: 0.62137119 mi
 1 mile: 1.609344 km
 TODO convert string input to lowercase.
 TODO investigate char usage.
 */
public class KmMilesConverter {
    public static void main (String[] args){
        System.out.println("If you want to convert from kilometers to miles");
        System.out.println("press 'm'.");
        System.out.println("If you want to convert from miles to kilometers");
        System.out.println("press 'k'.");
        Scanner inputScanner = new Scanner(System.in);
        //string should probably be char
        String dest = inputScanner.next();
        if(dest.equals("m")){
            System.out.println("You chose to convert from kilometers to miles.");
        }else if(dest.equals("k")){
            System.out.println("You chose to convert from miles to kilometers.");
        }else {
            System.out.println("You didn't follow the instructions.");
        }



    }
}
