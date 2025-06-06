
import java.util.Arrays;


public class SearchIn2DArrays {

    public static void main(String[] args) {
        
        //This is a way of assigning a array.
        // int[][] arr1 = new int[][] {};

        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int target =  6;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    
    static int[] search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
