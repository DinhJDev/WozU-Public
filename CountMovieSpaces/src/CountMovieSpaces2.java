import java.util.Scanner;

public class CountMovieSpaces2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String quote = sc.nextLine();
        int spaces= 0;
        for (int i = 0; i < quote.length(); i++) {
            if (Character.isWhitespace(quote.charAt(i))) {
                spaces++;
            }
        }
        System.out.println(spaces);
    }
}
