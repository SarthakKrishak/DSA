
import java.util.*;

public class TwoD_array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //We have to mention row number and column is not mandatory.(As its a array of arrays)
        // int arr[][] = new int[3][3];

        //This will give me no of rows.
        // System.out.println(arr.length);

        // for(int row = 0; row < arr.length; row++) {
        //     for (int col = 0; col < arr[row].length; col++) {
        //         arr[row][col] = sc.nextInt();
        //     }
        // }

        // int arr1[][] = {
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9}
        // };

        // int arr5[][] = new int[3][3];

        // for (int i = 0; i < arr5.length; i++) {
        //     for (int j = 0; j < arr5[i].length; j++) {
        //         arr5[i][j] = sc.nextInt();
        //     }
        // }

        //To get output
        // for (int i = 0; i < arr5.length; i++) {
        //     System.out.println(Arrays.toString(arr5[i]));
        // }

        //Enhanced for loop for printing output
        // for (int[] a : arr5) {
        //     System.out.println(Arrays.toString(a));
        // }

        int arr1[][] = {
                { 1, 2, 3, 5 },
                { 4, 5, 6 },
                { 7, 8 }
        };

        for (int row = 0; row < arr1.length; row++) {
            for (int col = 0; col < arr1[row].length; col++) {
                System.out.print(arr1[row][col] + " ");
            }
            System.out.println();
        }

        



    }
}
