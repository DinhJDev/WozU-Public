import java.util.ArrayList;
import java.util.Scanner;

public class CarCareChoice {
    public static void main(String[] args) {
        ArrayList<String> sList = new ArrayList<String>();
        sList.add("oil change");
        sList.add("tire rotation");
        sList.add("battery check");
        sList.add("brake inspection");

        ArrayList<Integer> pList = new ArrayList<Integer>();
        pList.add(25);
        pList.add(22);
        pList.add(15);
        pList.add(5);

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if (sList.contains(input)) {
            System.out.println(input + ": $" + pList.get(sList.indexOf(input)));
        } else {
            System.out.println("Error: Car Service Not Found");
        }
    }
}
