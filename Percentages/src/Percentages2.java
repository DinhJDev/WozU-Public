import java.util.Scanner;

public class Percentages2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        computePercent(a,b);
    }
    public static void computePercent(double c, double d) {
        System.out.println(c + " is " + c/d*100 + " percent of " + d);
    }
}