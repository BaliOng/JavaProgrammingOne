
package Chapter8;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Program that records employee sales
 * @author Bali Ong
 */
public class P8 {
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
        public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[][] salesInfo = {
            {"-", "M", "T", "W", "H", "F"},
            {"A", "0", "0", "0", "0", "0"},
            {"B", "0", "0", "0", "0", "0"},
            {"C", "0", "0", "0", "0", "0"},
            {"D", "0", "0", "0", "0", "0"},
    };
    int row = 0; int column = 0;
    String s; String d; String a;
    boolean cont = true;
    while (cont == true){
    System.out.println("Enter the salesman ID as A, B, C, or D");
    s = input.next();
    int x = CheckRow(s);
    System.out.println("Enter the Day as M, T, W, H, or F");
    d = input.next();
    int y = CheckColumn(d);
    System.out.println("Enter the amount for the sale");
    a = input.next();
    salesInfo[x][y] = Integer.toString(Integer.parseInt(salesInfo[x][y]) + Integer.parseInt(a));
    System.out.println("Do you want to keep adding sales? Enter yes or no.");
    String c = input.next();
    if (c.equals("no"))
    cont = false;
    while(!(c.equals("no")) && !(c.equals("yes"))){
        System.out.println("Invalid input. Try again.");
        c = input.next();
    }
    }
    System.out.println(Arrays.deepToString(salesInfo).replace("], ", "]\n"));
    
}  
        /**
     * CheckRow makes sure the row is valid and returns its location
     *
     * @param s the requested row
     * @return the the row where the sale should be stored
     */
   public static int CheckRow(String s){
       Scanner input = new Scanner(System.in);
       int row = 0;
       while (row < 1){
       if (null == s) {
           System.out.println("Invalid salesman ID. Please re-enter.");
           s = input.next();
           } else switch (s) {
               case "A":
                   row = 1;
                   break;
               case "B":
                   row = 2;
                   break;
               case "C":
                   row = 3;
                   break;
               case "D":
                   row = 4;
                   break;
               default:
                   System.out.println("Invalid salesman ID. Please re-enter.");
                   s = input.next();
                   break;
           }
   }
             return row;   
}
   /**
     * CheckColumn makes sure the column is valid and returns its location
     *
     * @param s the requested column
     * @return the column where the sale should be stored
     */
      public static int CheckColumn (String s){
       Scanner input = new Scanner(System.in);
       int row = 0;
       while (row < 1){
       if (null == s) {
           System.out.println("Invalid day. Please re-enter.");
           s = input.next();
           } else switch (s) {
               case "M":
                   row = 1;
                   break;
               case "T":
                   row = 2;
                   break;
               case "W":
                   row = 3;
                   break;
               case "H":
                   row = 4;
                   break;
               case "F":
                   row = 5;
                   break;
               default:
                   System.out.println("Invalid day. Please re-enter.");
                   s = input.next();
                   break;
           }
   }
             return row;   
}
}
