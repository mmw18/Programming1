/* 
 * Pseudocode
 * 
 * START
 *  - Ask user to enter their weekly income and let them know of the expected outcome (withholding amount).
 *  - Store the user's answer into a variable
 *  - Initialize a variable that will hold the withholding rate
 *  - Determine tax rate based on income, using if-else-if structure: set comparison values are less than 500, 500-1499, 1500-2499, and 3k+
 *  - Set withholding amount equal to answered income * rate / 100
 *  - Display the amount to the user alongside a description message
 * END
 */

import java.util.Scanner;

public class withholdingCalc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your weekly income to see your weekly tax withholding: ");

        double income = scanner.nextDouble();

        double rate;

        if (income < 500) {
            rate = 10.0;
        } else if (income < 1500) {
            rate = 15.0;
        } else if (income < 2500) {
            rate = 20.0;
        } else {
            rate = 30.0;
        }

        double withholding = income * rate / 100;

        System.out.printf("Your withholding amount is: $%.2f%n", withholding);

        scanner.close();
    }
}
