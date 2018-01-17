package Chapter6;

import java.util.Scanner;

/**
 * Program that converts dollars to Euros, Pounds, or Yen
 *
 * @author Bali Ong
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String moneyType;
        boolean cont = true;
        boolean x = true;
        double money;
        double r = 1;
        double p;
        double e;
        double y;
        System.out.println("How many Euros will a dollar buy?");
        e = input.nextDouble();
        System.out.println("How many Pounds will a dollar buy?");
        p = input.nextDouble();
        System.out.println("How many Yen will a dollar buy?");
        y = input.nextDouble();
        double[] rates = new double[3];
        rates[0] = e;
        rates[1] = p;
        rates[2] = y;
        while (cont == true) {
            System.out.println("How much money and what type of currency do you want?");
            money = input.nextDouble();
            moneyType = input.next();
            if (moneyType.toUpperCase().equals("E")) {
                r = rates[0];
            } else {
                if (moneyType.toUpperCase().equals("P")) {
                    r = rates[1];
                } else {
                    if (moneyType.toUpperCase().equals("Y")) {
                        r = rates[2];
                    } else {
                        System.out.println("Invalid.");
                    }
                }
            }
            CurrencyExchange(r, money);
            x = true;
            while (x == true) {
                System.out.println("\n Do you want to keep converting? Enter yes or no.");
                String c = input.next();
                if (c.equals("no")) {
                    cont = false;
                }
                if (!(c.equals("no")) && !(c.equals("yes"))) {
                    System.out.println("Invalid. Please re-enter your response.");
                } else {
                    x = false;
                }
            }
        }

    }

    /**
     * CurrencyExchange accounts for the price of exchange and prints the final
     * amount
     *
     * @param x the exchange rate for the currency
     * @param z how much money is being exchanged
     */
    public static void CurrencyExchange(double x, double z) {
        double d;
        if (z >= 100) {
            d = (z / 100) * 95;
        } else {
            d = (z / 100) * 90;
        }
        double amount = x * d;
        System.out.printf("Your converted currency amounts to %4.2f", amount);
    }
}
