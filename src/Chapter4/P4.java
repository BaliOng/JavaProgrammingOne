package Chapter4;

import java.util.Scanner;

/**
 * Determine which bidder is a better deal based on hours and pay rate
 *
 * @author Bali Ong
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Who is the first bidder? How many hours will they take? How much do they charge?");
        String bidder1 = input.next();
        int bidder1Hours = input.nextInt();
        double bidder1Price = input.nextDouble();
        System.out.print("Who is the second bidder? How many hours will they take? How much do they charge?");
        String bidder2 = input.next();
        int bidder2Hours = input.nextInt();
        double bidder2Price = input.nextDouble();
        double cost1 = bidder1Price * (double) bidder1Hours;
        double cost2 = bidder2Price * (double) bidder2Hours;
        if (cost1 > cost2 || (cost1 == cost2 && bidder1Hours > bidder2Hours)) {
            System.out.printf("Bidder 2 wins! The cost is $%4.2f", cost2);
        } else {
            if (cost1 < cost2 || (cost1 == cost2 && bidder1Hours < bidder2Hours)) {
                System.out.printf("Bidder 1 wins! The cost is $%4.2f", cost1);
            } else {
                System.out.printf("The bids are identical. The cost is $%4.2f", cost1);
                System.out.println(" and the hours are " + bidder2Hours);
            }
        }

    }
}
