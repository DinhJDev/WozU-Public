import java.util.ArrayList;
import java.util.Scanner;

public class CategorizeStrings2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> shortStrings = new ArrayList<String>();
        ArrayList<String> longStrings = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Please enter a string to be sorted. Type 'stop' to stop entering values.");
            String input = sc.nextLine();
            if (input.equals("stop")) {
                break;
            }
            if (input.length() <= 10) {
                shortStrings.add(input);
            } else {
                longStrings.add(input);
            }
        }
        System.out.println("Which list would you like to return? Long (L) or Short (S)?");
        String input = sc.nextLine();
        if (input.equals("L")) {
            if (longStrings.size() > 0) {
                System.out.println(longStrings);
            } else {
                System.out.println("The long list is empty.");
            }
        } else if (input.equals("S")) {
            if (shortStrings.size() > 0) {
                System.out.println(shortStrings);
            } else {
                System.out.println("The short list is empty.");
            }
        } else {
            System.out.println("You did not enter a valid list type. Please enter 'L' or 'S'.");
        }

        // Create two lists
        // Put into
    }
    
}
