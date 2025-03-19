import java.util.Scanner;

public class RevenueCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for unit price and quantity
        System.out.print("Enter unit price: ");
        double unitPrice = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        // Calculate total revenue before discount
        double totalRevenue = unitPrice * quantity;

        // Determine discount rate based on quantity
        double discountRate = 0.0;
        if (quantity >= 100 && quantity <= 120) {
            discountRate = 0.15; // 15% discount
        } else if (quantity > 120) {
            discountRate = 0.20; // 20% discount
        }

        // Calculate discount amount and final revenue
        double discountAmount = totalRevenue * discountRate;
        double finalRevenue = totalRevenue - discountAmount;

        // Print the results
        System.out.printf("The revenue from sale: %.2f$\n", finalRevenue);
        System.out.printf("Discount: %.2f$ (%.1f%%)\n", discountAmount, discountRate * 100);

        scanner.close();
    }
}



