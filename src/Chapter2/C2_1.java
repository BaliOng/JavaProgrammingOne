package Chapter2;

import java.util.Scanner;

/**
 * Program that converts from Celsius to Fahrenheit
 *
 * @author Bali Ong
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the temperature in Celsius? ");
        double celsius = input.nextDouble();
        double fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.println("The temperature in Fahrenheit is " + fahrenheit);
    }

}
