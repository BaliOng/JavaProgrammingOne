package Chapter7;

import java.util.Scanner;

/**
 * finds the minimum number in an array
 *
 * @author Bali Ong
 */
public class C7_9 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        double[] nums = new double[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers: ");
        nums[0] = input.nextDouble();
        for (int i = 1; i < 10; i++) {
            nums[i] = input.nextDouble();
        }
        double min = nums[0];
        for (int i = 1; i < 10; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println("The minimum number is " + min);
    }
}
