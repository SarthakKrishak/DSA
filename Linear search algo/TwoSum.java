
import java.util.*;

class TwoSum {
    public static void main(String [] args) {
       int []arr = {3,2,3};
       int target = 6;
        System.out.println(Arrays.toString(TwoSum(arr, target)));
    }

    static int[] TwoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int [] {};
    }
}