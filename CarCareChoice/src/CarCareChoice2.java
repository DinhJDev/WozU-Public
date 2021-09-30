import java.util.ArrayList;
import java.util.Scanner;

public class CarCareChoice2 {
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
        System.out.println(input.substring(0,3));

        for (int i = 0; i < sList.size(); i++) {
            if (sList.get(i).contains(input.substring(0,3))) {
                System.out.println(sList.get(i) + ": $" + pList.get(i));
            }
        }
    }
}
