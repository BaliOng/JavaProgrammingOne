package Chapter5;

import java.util.Scanner;

/**
 * A program that records votes
 *
 * @author Bali Ong
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        String userVote = "";
        Scanner input = new Scanner(System.in);
        int y = 0, n = 0;
        while (!"Q".equals(userVote) && !"q".equals(userVote)) {
            System.out.println("Enter Y to vote yes, N to vote no, or Q to quit voting.");
            userVote = input.next();
            if (userVote.equals("Y") || userVote.equals("y")) {
                y = y + 1;
            } else {
                if (userVote.equals("N") || userVote.equals("n")) {
                    n = n + 1;
                } else {
                    if (!"Q".equals(userVote) && !"q".equals(userVote)) {
                        System.out.println("INVALID CODE");
                    }
                }
            }
        }
        System.out.println("Total yes votes: " + y);
        System.out.println("Total no votes: " + n);
    }

}
