import java.util.Scanner;

public class WorkEligibilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Check eligibility to work
        if (age >= 16) {
            System.out.println("You are eligible to work.");
        } else {
            System.out.println("You are not eligible to work. You must be at least 16 years old.");
        }

        scanner.close();
    }
}



