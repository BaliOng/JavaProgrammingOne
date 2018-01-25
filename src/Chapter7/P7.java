
package Chapter7;

import java.util.Scanner;

/**
 * Program to average numbers
 * @author Bali Ong
 */
public class P7 {
    
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
            int arrayAmt;
            Scanner input = new Scanner(System.in);
            System.out.println("How many numbers do you want?");
            arrayAmt = input.nextInt();
            int[] nums = new int[arrayAmt];
            fillArray(nums);
            double avg = average(nums);
            System.out.println("The average of the numbers is: " + avg);
            
        }
    
    /**
     * fillArray records numbers
     *
     * @param nums amount of numbers to be averaged
     */
        public static void fillArray (int[] nums){
        Scanner input = new Scanner(System.in);
            for (int y = 0; y < nums.length; y++)
            {
                System.out.println("What number would you like?");
                nums[y] = input.nextInt();
            }
        }
        
    /**
     * average - averages numbers
     *
     * @param x takes to the numbers in an array form
     * @return the average of the numbers
     */
        public static double average (int[] x){
            int sum = 0; double avg;
            for (int y = 0; y < x.length; y++)
            {
                sum += x[y];
            }
            avg = (double)sum/(x.length);
            return avg;
        }
}
