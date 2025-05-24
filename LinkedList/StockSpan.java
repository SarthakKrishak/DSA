import java.util.Scanner;

public class StockSpan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[n];
        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int span;
        // we have both of the arrays
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[i + 1]) {
                span = i - 1 + i;
            }
        }

    }   
}
