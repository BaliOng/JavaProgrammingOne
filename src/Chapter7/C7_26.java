package Chapter7;

import java.util.Scanner;

/**
 * Program that compares two arrays
 *
 * @author Bali Ong
 */
public class C7_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int x;
        int y;
        System.out.println("How many integers do you want to put in array 1?");
        x = input.nextInt();
        System.out.println("How many integers do you want to put in array 2?");
        y = input.nextInt();
        int[] a1 = new int[x];
        int[] a2 = new int[y];
        System.out.println("Enter the values for array 1: ");
        a1[0] = input.nextInt();
        for (int i = 1; i < a1.length; i++) {
            a1[i] = input.nextInt();
        }
        System.out.println("Enter the values for array 2: ");
        a2[0] = input.nextInt();
        for (int i = 1; i < a2.length; i++) {
            a2[i] = input.nextInt();
        }
        CompareArrays(a1, a2);
    }

    /**
     * CompareArrays
     *
     * @param a holds the first list of integers
     * @param b holds the second list of integers
     */
    static void CompareArrays(int[] a, int[] b) {
        boolean equal = true;
        if (a.length != b.length) {
            equal = false;
        } else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    equal = false;
                }
            }
        }
        if (equal == true) {
            System.out.println("The arrays are strictly identical.");
        } else {
            System.out.println("The arrays are not strictly identical");
        }
    }
}
