
import java.util.*;

//Basically we sort the array in parts and basically we divide the array into teo parts and then first sort the first half and then sort the second half and then properly merge them using recursion.

public class sort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 2, 3, 1 };
        // Here the original array is not modified basically a new array is created using Arrays.copyOfRange
        arr = merge(arr);
        System.out.println(Arrays.toString(arr));
    }


    static int[] merge(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        
        int[] left = merge(Arrays.copyOfRange(arr, 0, mid));
        int[] right = merge(Arrays.copyOfRange(arr, mid, arr.length));

        return mergeArr(left, right);
    }


    static int[] mergeArr(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int i =0, j=0, k = 0;

        //Now we are running it till when it gets out of bound
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // Its is possbile that both the arrays are not of same length
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;

    }
}
