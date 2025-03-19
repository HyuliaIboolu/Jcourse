import java.util.Scanner;

public class VacationAdvisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for vacation type
        System.out.print("Enter the type of vacation (Beach or Mountain): ");
        String vacationType = scanner.nextLine().trim().toLowerCase();

        // Take user input for daily budget
        System.out.print("Enter your daily budget per person: ");
        double budget = scanner.nextDouble();

        // Advise destination based on vacation type and budget
        if (vacationType.equals("beach")) {
            if (budget < 50) {
                System.out.println("We advise you to go to Bulgaria for a Beach vacation.");
            } else {
                System.out.println("We advise you to go Outside Bulgaria for a Beach vacation.");
            }
        } else if (vacationType.equals("mountain")) {
            if (budget < 30) {
                System.out.println("We advise you to go to Bulgaria for a Mountain vacation.");
            } else {
                System.out.println("We advise you to go Outside Bulgaria for a Mountain vacation.");
            }
        } else {
            System.out.println("Sorry, there is no information about this type of vacation.");
        }

        scanner.close();
    }
}



