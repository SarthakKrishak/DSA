import java.util.*;
public class posiNegiZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];

        int postive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > 0) {
                postive++;
            } else if (arr[i] < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        System.out.printf("%.3f", (double) postive / arr.length);
        System.out.println();
        System.out.printf("%.3f", (double) negative / arr.length);
        System.out.println();
        System.out.printf("%.3f", (double) zero / arr.length);
    }
}
