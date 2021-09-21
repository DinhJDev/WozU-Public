import java.time.LocalDate;
import java.util.Scanner;

public class PastPresentFuture2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the month number: ");
        int month = sc.nextInt();
        System.out.println("Enter the day: ");
        int day = sc.nextInt();
        System.out.println("Enter the year: ");
        int year = sc.nextInt();

        LocalDate userDate = LocalDate.of(year, month, day);

        if (userDate.isAfter(LocalDate.now())) {
            System.out.println("This date is in the future.");
        } else if (userDate.isBefore(LocalDate.now())) {
            System.out.println("This date is the past.");
        } else if (userDate.equals(LocalDate.now())) {
            System.out.println("This is today!");
        }
    }
}