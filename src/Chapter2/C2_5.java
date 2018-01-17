package Chapter2;

import java.util.Scanner;

/**
 * Program that calculates tip and total price
 *
 * @author Bali Ong
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuity = input.nextDouble();
        double gratuityPercent = (subtotal / 100) * gratuity;
        double total = (gratuityPercent + subtotal);
        System.out.println("The gratuity is " + gratuityPercent + " and the total is " + total);
    }

}
