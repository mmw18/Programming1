/**
 * Pseudocode
 * START
 *  - Initialize both a list to store the days of the week and one to store the temperatures.
 *  - Make method to take input from the user.
 *  - Greet the user and provide information and instruction about the program.
 *  - Make a loop:
 *    - Ask the user to enter the name of the day or 'week'
 *    - If the user enters 'week', break out of the loop.
 *    - If the user enters a day name ask them to enter the temperature that day and add this information to the lists.
 *    - If the user does not enter a day name or 'week', give error message and ask them to try again.
 *  - After the loop finishes:
 *    - If there have been days entered, print the days and their temperatures, as well as the calculated average temperature.
 *    - If no days have been entered, let the user know there isn't data to display.
 * END
 */



import java.util.ArrayList;
import java.util.Scanner;

public class sevenDayTempLog {
    public static void main(String[] args) {
        ArrayList<String> days = new ArrayList<>();
        ArrayList<Double> temps = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        String input = "";

        System.out.println("Greetings! With this 7 day temperature log, please log the temperature in fahrenheit for each day of the week.");
        System.out.println("You will be prompted to first enter the name of day which you are logging, then you'll be asked for the temperature.");
        System.out.println("When you are done with the week, or any time when you'd like to get an update, type 'week' instead of a weekday name and see both a list of all logged temperatures, but also a current average for the week's entries.");
        System.out.println("");

        while (!input.equalsIgnoreCase("week")) {
            System.out.println("Please enter the day of the week, or simply 'week' for full log info.");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("week")) {
                break;
            }

            if (input.equalsIgnoreCase("Monday") || input.equalsIgnoreCase("Tuesday") || input.equalsIgnoreCase("Wednesday") || input.equalsIgnoreCase("Thursday") || input.equalsIgnoreCase("Friday") || input.equalsIgnoreCase("Saturday") || input.equalsIgnoreCase("Sunday")) {

                System.out.println("What is the temperature on this beautiful " + input + "? ");
                double temp = scanner.nextDouble();
                scanner.nextLine();

                days.add(input);
                temps.add(temp);

            } else {
                System.out.println("This isn't a day! Please enter a valid day of the week.\n");
            }
        }

        if (!days.isEmpty()) {
            System.out.println("\nThe logged temperatures for this week are:"); 
            double totalTemp = 0;

            for (int i = 0; i < days.size(); i++) {
                System.out.println(days.get(i) + ": " + temps.get(i) + "°F");
                totalTemp += temps.get(i);
            }

            double weeksAverage = totalTemp / days.size();
            System.out.println("\nAverage temperature for the week: " + weeksAverage + "°F");  
        } else {
            System.out.println("So sorry, seems no temperatures were entered.");
        }

        scanner.close();
    }
}
