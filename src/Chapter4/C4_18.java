package Chapter4;

import java.util.Scanner;

/**
 * Identify a student's grade and major from two characters
 *
 * @author Bali Ong
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String x = input.next();
        String major = x.substring(0, 1);
        String status = x.substring(1);
        String studentMajor = "";
        String studentClass = "";
        boolean invalid = false;
        if ("M".equals(major)) {
            studentMajor = "Mathematics";
        } else {
            if ("C".equals(major)) {
                studentMajor = "Computer Science";
            } else {
                if ("I".equals(major)) {
                    studentMajor = "Information Technology";
                } else {
                    invalid = true;
                }
            }

        }
        if (invalid == false) {
            if ("1".equals(status)) {
                studentClass = "Freshman";
            } else {
                if ("2".equals(status)) {
                    studentClass = "Sophomore";
                } else {
                    if ("3".equals(status)) {
                        studentClass = "Junior";
                    } else {
                        if ("4".equals(status)) {
                            studentClass = "Senior";
                        } else {
                            invalid = true;
                        }
                    }
                }
            }
        }
        if (invalid == true) {
            System.out.println("Invalid input");
        } else {
            System.out.println(studentMajor + " " + studentClass);
        }

    }
}
