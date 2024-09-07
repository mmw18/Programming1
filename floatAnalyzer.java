/** Pseudocode
 * START
 *  - Greet the user with a message and ask them to enter five numbers, which can have up to 2 decimal places.
 *    Making sure to remind them to not begin or end with a space.
 *  - Read the user's input and remove the spaces to give individual numbers
 *  - Make sure it is exactly 5 numbers that are given and that all numbers meet criteria. 
 *    If this IS true:
 *     - Convert every number from a string to a float
 *     - update the total, min, and max
 *     - Calculate average and interest rate based on the variable interestRate
 *    If this is FALSE:
 *     - Remind the user of the rules and ask them to re-enter
 *  - Print out all results (total, average, min, max, and interest rate)
 * END
 */


import java.util.Scanner;

public class floatAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Greet the user and let them know what's needed for the program
        System.out.println("Hello and welcome!");
        System.out.println("Please enter exactly five numbers, with up to 2 decimal places, separated by a single space. Please ensure you do not begin or end with a space either. Enter now: ");

        double total = 0.0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double interestRate = 0.20; // Interest rate initialized to a variable

        boolean validInput = false;

        while (!validInput) {
            // Read the user's input
            String input = scanner.nextLine().trim(); // Make sure there are not any beginning or ending spaces

            // Split out the whole input to individual numbers
            String[] parts = input.split("\\s+"); // Split by one or more spaces

            if (parts.length == 5) {
                try {
                    // Initialize variables to process the numbers
                    total = 0.0;
                    max = Double.MIN_VALUE;
                    min = Double.MAX_VALUE;

                    // Process all numbers entered
                    for (String part : parts) {
                        double number = Double.parseDouble(part);

                        // Update the total, max, and min
                        total += number;
                        if (number > max) {
                            max = number;
                        }
                        if (number < min) {
                            min = number;
                        }
                    }

                    // Calculate average and interest amount
                    double average = total / 5;
                    double interest = total * interestRate;

                    // Display all results
                    System.out.println("\nHere are some calculations for the values you entered:");
                    System.out.println("Total: " + total);
                    System.out.println("Average: " + average);
                    System.out.println("Maximum: " + max);
                    System.out.println("Minimum: " + min);
                    System.out.println("20% interest rate: " + interest);

                    validInput = true; // Exit the loop since a valid input is received
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number format ): Please ensure all inputs are valid floating-point numbers.");
                }
            } else {
                System.out.println("Invalid number of inputs. Please enter specifically FIVE numbers.");
            }
        }

        scanner.close();
    }
}