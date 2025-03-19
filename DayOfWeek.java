import java.util.Scanner;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the day number (1-7)
        System.out.print("Enter a digit (1-7) to represent the day of the week: ");
        int dayNumber = scanner.nextInt();

        // Validate the input
        if (dayNumber < 1 || dayNumber > 7) {
            System.out.println("Invalid input! Please enter a digit between 1 and 7.");
        } else {
            // Determine the day of the week
            String dayOfWeek;
            switch (dayNumber) {
                case 1:
                    dayOfWeek = "Monday";
                    break;
                case 2:
                    dayOfWeek = "Tuesday";
                    break;
                case 3:
                    dayOfWeek = "Wednesday";
                    break;
                case 4:
                    dayOfWeek = "Thursday";
                    break;
                case 5:
                    dayOfWeek = "Friday";
                    break;
                case 6:
                    dayOfWeek = "Saturday";
                    break;
                case 7:
                    dayOfWeek = "Sunday";
                    break;
                default:
                    dayOfWeek = "Unknown";
                    break;
            }

            // Determine the correct ordinal suffix
            String suffix;
            switch (dayNumber) {
                case 1:
                    suffix = "st";
                    break;
                case 2:
                    suffix = "nd";
                    break;
                case 3:
                    suffix = "rd";
                    break;
                default:
                    suffix = "th";
                    break;
            }

            // Print the result
            System.out.println("The " + dayNumber + suffix + " day of the week is " + dayOfWeek + ".");
        }

        scanner.close();
    }
}



