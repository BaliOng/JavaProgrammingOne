package Chapter3;

import java.util.Scanner;

/**
 * A program that will have you guess heads or tails then determine if you
 * guessed correctly
 *
 * @author Bali Ong
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        boolean heads = false;
        //decides whether or not heads is true based on a random number
        if (Math.random() < 0.5) {
            heads = true;
        }
        boolean choice = false;
        System.out.println("Heads or tails? Pur 1 for heads and 0 for tails");
        int input = userInput.nextInt();
        if (input == 1) {
            choice = true;
        }
        if (input == 0) {
            choice = false;
        }
        if (heads == choice) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect guess.");
        }

    }

}
