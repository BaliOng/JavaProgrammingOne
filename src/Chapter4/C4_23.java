package Chapter4;

import java.util.Scanner;

/**
 * Program that calculates an employee's tax rates and pay
 *
 * @author Bali Ong
 */
public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Employee name: ");
        String name = input.next();
        System.out.print("Number of hours worked: ");
        double hours = input.nextDouble();
        System.out.print("Hourly pay rate: ");
        double pay = input.nextDouble();
        System.out.print("Federal tax withholding rate: ");
        double fedTax = input.nextDouble();
        System.out.print("State tax withholding rate: ");
        double stateTax = input.nextDouble();
        double grossPay = pay * hours;
        double fedPercent = grossPay * fedTax;
        double statePercent = grossPay * stateTax;
        double totalDeduction = fedPercent + statePercent;
        double netPay = grossPay - totalDeduction;
        System.out.println(name);
        System.out.println(hours + " hours worked");
        System.out.println("$" + pay + " dollars per hour");
        System.out.println("Gross Pay: $" + grossPay);
        System.out.print("Federal Withholding (" + fedTax * 100 + "%):");
        System.out.printf(" $%4.2f", fedPercent);
        System.out.print("\n State Withholding (" + stateTax * 100 + "%):");
        System.out.printf(" $%4.2f", statePercent);
        System.out.printf("\n Total Deduction: $%4.2f", totalDeduction);
        System.out.printf("\n Net Pay: $%4.2f", netPay);
    }

}
