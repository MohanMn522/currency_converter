import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Conversion rates (you can adjust these as needed)
        double usdToEurRate = 0.85;
        double eurToUsdRate = 1.18;

        System.out.println("Welcome to the Currency Converter!");
        System.out.println("Choose an option:");
        System.out.println("1. Convert USD to EUR");
        System.out.println("2. Convert EUR to USD");
        System.out.println("3. Quit");

        int choice;
        do {
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount in USD: $");
                    double usdAmount = scanner.nextDouble();
                    double eurAmount = usdAmount * usdToEurRate;
                    System.out.printf("%.2f USD = %.2f EUR%n", usdAmount, eurAmount);
                    break;
                case 2:
                    System.out.print("Enter amount in EUR: €");
                    double eurAmount2 = scanner.nextDouble();
                    double usdAmount2 = eurAmount2 * eurToUsdRate;
                    System.out.printf("%.2f EUR = %.2f USD%n", eurAmount2, usdAmount2);
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
    }
}
