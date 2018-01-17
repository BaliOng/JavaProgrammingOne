package Chapter3;

import java.util.Scanner;

/**
 * tells if an integer is divisible by five, six, and both numbers
 *
 * @author Bali Ong
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userInt = input.nextInt();
        boolean six = false;
        boolean five = false;
        if (userInt % 5 == 0) {
            five = true;
        }
        if (userInt % 6 == 0) {
            six = true;
        }
        System.out.print("Is " + userInt + " divisible by 5 and 6? ");
        if (five == true && six == true) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        System.out.print("Is " + userInt + " divisible by 5 or 6? ");
        if (five == true || six == true) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        System.out.print("Is " + userInt + " divisible by 5 or 6, but not both? ");
        if ((five == true && six == false) || (five == false && six == true)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

}
