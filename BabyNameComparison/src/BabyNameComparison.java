import java.util.ArrayList;
import java.util.Scanner;

public class BabyNameComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1 = sc.nextLine();
        String n2 = sc.nextLine();
        String n3 = sc.nextLine();
        ArrayList<String> nArray = new ArrayList<String>();

        nArray.add(n1);
        nArray.add(n2);
        nArray.add(n3);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i != j) {
                    System.out.println(nArray.get(i) + nArray.get(j));
                }
            }
        }
    }
}
