import java.util.*;

public class first {
    public static void main(String[] args) {
        int arr[] = { 5, 3, 2, 4, 1,9,8 };
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void bubble(int[] arr) {
        boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }

            }
            
            //If you didn't swapped for i=0 then the array is sorted,so we will prevent it for running it for i=1.
            if (swapped == false) {
                break;
            }
        }
    }
}
