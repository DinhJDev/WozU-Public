import java.util.Scanner;

public class NumbersDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(displayTwiceTheNumber(a));
        System.out.println(displayNumberPlusFive(a));
        System.out.println(displayNumberSquared(b));
    }
    public static int displayTwiceTheNumber(int number){
        return number*2;
    }
    public static int displayNumberPlusFive(int number){
        return number+5;
    }
    public static int displayNumberSquared(int number) {
        return number*number;
    }
}