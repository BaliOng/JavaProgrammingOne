package Chapter2;

import java.util.Scanner;

/**
 * Program that calculates the area and volume of a cylinder
 *
 * @author Bali Ong
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder");
        double rad = input.nextDouble();
        double len = input.nextDouble();
        double area = rad * rad * 3.14;
        double vol = area * len;
        System.out.println("The area is " + area);
        System.out.println("The volume is " + vol);
    }

}
