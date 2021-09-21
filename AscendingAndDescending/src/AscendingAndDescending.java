import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AscendingAndDescending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int[] asc = {num1, num2, num3};

        Arrays.sort(asc);

        System.out.println("Ascending: " + Arrays.toString(asc));

        reverse(asc);

        System.out.println("Descending: " + Arrays.toString(asc));
    }

    public static void reverse (int[] array) {
        int  n = array.length;

        for (int i = 0; i < n/2; i++) {
            int temp = array[i];

            array[i] = array[n-i-1];

            array[n-i-1] = temp;
        }
    }
}
