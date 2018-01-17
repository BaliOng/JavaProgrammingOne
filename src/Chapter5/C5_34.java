package Chapter5;

import java.util.Scanner;

/**
 * A rock, paper, scissors game
 *
 * @author Bali Ong
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int compWins = 0;
        int userWins = 0;
        boolean game = true;
        while (game == true) {
            double generator = Math.random() * 3 + 1;
            int cChoice = (int) generator;
            //System.out.println(cChoice);
            System.out.println("Choose rock (1), paper (2), or scissors (3).");
            int choice = input.nextInt();
            if (cChoice == choice) {
                System.out.println("Tie.");
            }
            if ((cChoice == 1 && choice == 2) || (cChoice == 2 && choice == 3) || (cChoice == 3 && choice == 1)) {
                System.out.println("User wins this round.");
                userWins++;
            }
            if ((choice == 1 && cChoice == 2) || (choice == 2 && cChoice == 3) || (choice == 3 && cChoice == 1)) {
                System.out.println("Computer wins this round.");
                compWins++;
            }
            if (compWins == 2 || userWins == 2) {
                game = false;
            }
        }
        if (compWins > userWins) {
            System.out.println("Computer wins the game.");
        } else {
            System.out.println("User wins the game.");
        }
    }
}
