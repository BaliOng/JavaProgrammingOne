
package Chapter8;
/**
 * Displays the hours each employee on each day
 * @author Bali Ong
 */
public class C8_4 {
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main (String[] args){
    int[][] employeeHours = new int[][]{{2,4,3,4,5,8,8}, {7,3,4,3,3,4,4}, {3,3,4,3,3,2,2,}, 
    {9,3,4,7,3,4,1}, {3,5,4,3,6,3,8}, {3,4,4,6,3,4,4}, {3,7,4,8,3,8,4}, {6,3,5,9,2,7,9}};
    System.out.println("           Su M T W Th F Sa");
    for (int i = 0; i < 8; i++)
    {
        System.out.print("\n Employee " + i + "  ");
        for (int f = 0; f < 7; f++)
            System.out.print(employeeHours[i][f] + " ");
    }
    }

}
