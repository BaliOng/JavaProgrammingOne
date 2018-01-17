package Chapter3;

import java.util.Scanner;

/**
 * Program that determines which of two packages is a better deal
 *
 * @author Bali Ong
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a weight and price for package 1: ");
        double w1 = input.nextDouble();
        double p1 = input.nextDouble();
        System.out.print("Enter a weight and price for package 2: ");
        double w2 = input.nextDouble();
        double p2 = input.nextDouble();
        double val1 = p1 / w1;
        double val2 = p2 / w2;
        if (val1 > val2) {
            System.out.println("Package two is a better deal.");
        } else {
            if (val1 == val2) {
                System.out.println("They are the same.");
            } else {
                System.out.println("Package one is a better deal.");
            }
        }

    }

}
