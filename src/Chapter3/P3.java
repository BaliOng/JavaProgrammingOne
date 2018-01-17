package Chapter3;

import java.util.Scanner;

/**
 * Determines the relationship between two numbers, if they can create a proper
 * fraction, what grade the first number earns, and if the second number is
 * between 0 and 100
 *
 * @author Bali Ong
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double numOne = input.nextDouble();
        System.out.print("Enter another number: ");
        double numTwo = input.nextDouble();
        if (numOne < numTwo) {
            System.out.println("The first number is less than the second.");
        }
        if (numOne > numTwo) {
            System.out.println("The first number is greater than the second");
        }
        if (numOne == numTwo) {
            System.out.println("The first number is equal to the second number");
        }
        if (numOne <= numTwo) {
            System.out.println("The first number is less than or equal to the second");
        }
        if (numOne != numTwo) {
            System.out.println("The first number is not equal to the second");
        }

        if (numTwo == 0) {
            System.out.println("Cannot divide by zero");
        } else {
            if (numOne % numTwo != 0 && numOne / numTwo < 1) {
                System.out.println("Proper fraction");
            } else {
                System.out.println("Improper fraction");
            }
        }
        if (numOne >= 60) {
            if (numOne >= 70) {
                if (numOne >= 80) {
                    if (numOne >= 90) {
                        System.out.println("A");
                    } else {
                        System.out.println("B");
                    }
                } else {
                    System.out.println("C");
                }
            } else {
                System.out.println("D");
            }
        } else {
            System.out.println("F");
        }
        if (1 <= numTwo && numTwo <= 100) {
            System.out.println("In range");
        } else {
            System.out.println("Out of range");
        }
    }

}
