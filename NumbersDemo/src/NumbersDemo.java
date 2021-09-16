public class NumbersDemo {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;

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