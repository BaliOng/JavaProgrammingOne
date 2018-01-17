package Chapter2;

import java.util.Scanner;

/**
 * Program that calculates food price, tax, tip, and total cost of a meal
 *
 * @author Bali Ong
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter meal price, drink price, and dessert price: ");
        double meal = input.nextDouble();
        double drink = input.nextDouble();
        double dessert = input.nextDouble();
        double foodPrice = meal + drink + dessert; //calculate price without tax or tip
        double salesTax = foodPrice / 10; //calculate sales tax
        double total1 = foodPrice + salesTax;  //price of meal without the tip
        double tip = (total1 / 100) * 15; //price of the tip
        double totalFinal = total1 + tip; //the total price of the meal
        System.out.println("The food price " + foodPrice + ", the tax is " + salesTax + ", and the tip is " + tip);
        System.out.println("The total cost is " + totalFinal);
    }
}
