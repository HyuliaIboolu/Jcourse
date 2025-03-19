import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a temperature
        System.out.print("Enter the temperature: ");
        double temperature = scanner.nextDouble();

        // Ask the user for the direction of conversion
        System.out.print("Choose the conversion direction (1 for Celsius to Fahrenheit, 2 for Fahrenheit to Celsius): ");
        int choice = scanner.nextInt();

        // Perform the conversion based on the user's choice
        double convertedTemperature;
        if (choice == 1) {
            // Celsius to Fahrenheit conversion
            convertedTemperature = (temperature * 9 / 5) + 32;
            System.out.printf("%.2f°C is equal to %.2f°F.\n", temperature, convertedTemperature);
        } else if (choice == 2) {
            // Fahrenheit to Celsius conversion
            convertedTemperature = (temperature - 32) * 5 / 9;
            System.out.printf("%.2f°F is equal to %.2f°C.\n", temperature, convertedTemperature);
        } else {
            // Invalid choice
            System.out.println("Invalid choice! Please select 1 or 2.");
        }

        scanner.close();
    }
}
