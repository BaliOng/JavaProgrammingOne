package Chapter4;

import java.util.Scanner;

/**
 * Program that determines if one string is a substring of another
 *
 * @author Bali Ong
 */
public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String string1 = input.next();
        System.out.print("Enter String 2: ");
        String string2 = input.next();
        if (string1.contains(string2)) {
            System.out.println(string2 + " is a substring of " + string1);
        } else {
            System.out.println(string2 + " is a not substring of " + string1);
        }
    }

}
