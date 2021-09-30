import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CableCompanyBilling {
    public static void main(String[] args) {
        int premiumChannels, serviceConnects;
        double rProcessing = 4.50, rService = 20.50, rChannels  = 7.50,
                bProcessing = 15.00, b10Service = 75.00, bAddService = 5.00, bChannels = 50.00,
                totalCost = 0.00;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an account number:");
        String accNumber = sc.nextLine();
        System.out.println("Please enter a customer code ('R' or 'B':)");
        String customerCode = sc.nextLine();
        customerCode = customerCode.toUpperCase(Locale.ROOT);

        if (customerCode.equals("R")) {
            System.out.println("Enter # of premium channels:");
            premiumChannels = sc.nextInt();
            totalCost += rProcessing + rService + rChannels * premiumChannels;
            System.out.println(accNumber);
            System.out.println(totalCost);
        } else if (customerCode.equals("B")) {
            System.out.println("Enter # of basic service connections:");
            serviceConnects = sc.nextInt();
            System.out.println("Enter # of premium channels:");
            premiumChannels = sc.nextInt();
            totalCost += bProcessing + bChannels * premiumChannels;
            if (serviceConnects > 10) {
                totalCost = bProcessing + b10Service + (serviceConnects - 10) * bAddService + premiumChannels * bChannels;

            } else {
                totalCost = bProcessing + b10Service + bChannels * premiumChannels;
            }

            NumberFormat formatter = NumberFormat.getCurrencyInstance();
            String costString = formatter.format(totalCost);

            System.out.println(accNumber);
            System.out.println(costString);
        } else {
            System.out.println("Please enter a valid customer code.");
        }
    }
}
