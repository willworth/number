package uk.co.willworth.number;

public class Sample {

    public static void main(String[] args) {
        System.out.println("This is the clear sample class for testing ideas.");

        int x = 0;
        while(++x < 5) { x+=1; }
        String message = x > 5 ? "Greater than" : "Less Than";
        System.out.println(message+","+x);
    }
}



