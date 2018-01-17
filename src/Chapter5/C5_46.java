package Chapter5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Program that reverses a string
 *
 * @author Bali Ong
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("What is your string?");
        String x = input.next();
        String[] y = new String[x.length()];
        int end = (x.length() - 1);
        int sub = 0;
        while (end >= 0) {
            y[sub] = x.substring(end, end + 1);
            sub = sub + 1;
            end = end - 1;
        }
        String reverse = Arrays.toString(y);
        System.out.println("Reversed String: " + reverse);
    }

}
