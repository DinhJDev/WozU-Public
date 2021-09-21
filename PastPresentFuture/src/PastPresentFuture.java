import java.time.LocalDate;
import java.util.Scanner;

public class PastPresentFuture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the month number: ");
        int month = sc.nextInt();
        System.out.println("Enter the day: ");
        int day = sc.nextInt();
        System.out.println("Enter the year: ");
        int year = sc.nextInt();

        LocalDate userDate = LocalDate.of(year, month, day);

        if (userDate.isAfter(LocalDate.of(2021,12,31)) || userDate.isBefore(LocalDate.of(2021, 1,1))) {
            System.out.println("Your date isn't in 2021.");
        } else {
            if (userDate.isBefore(LocalDate.of(2021, 9,1))) {
                System.out.println("Your date is in 2021, but it's before September.");
            } else if (userDate.isAfter(LocalDate.of(2021, 9,30))) {
                System.out.println("Your date is in 2021, but it's after September.");
            } else {
                System.out.println("Your date is within September of 2021");
            }
        }
    }
}
