package Chapter6;

import java.util.Scanner;

/**
 * Checks to see if a password has all of the required characters
 *
 * @author Bali Ong
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your password?");
        String pass = input.next();
        PasswordCheck(pass);
    }

    /**
     * PasswordCheck checks to see if the password is valid
     *
     * @param s the password in a string
     */
    public static void PasswordCheck(String s) {
        boolean l = false;
        boolean x = false;
        boolean y = false;
        boolean check = false;
        int digitChecker = 0;
        if (s.length() >= 8) {
            l = true;
        }
        for (int c = 0; c < s.length(); c++) {
            if ("1234567890".contains(Character.valueOf(s.charAt(c)).toString())) {
                digitChecker += 1;
            }
        }
        if (digitChecker >= 2) {
            x = true;
        }
        for (int v = 0; v < s.length(); v++) {
            if (!Character.isLetter(s.charAt(v)) && !("1234567890".contains(Character.valueOf(s.charAt(v)).toString()))) {
                check = true;
            }
        }
        if (check == false) {
            y = true;
        }
        if (l == true && x == true && y == true) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }

}
