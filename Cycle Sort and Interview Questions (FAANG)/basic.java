
import java.util.*;

public class basic {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 1, 2, 5 };
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void cyclic(int[]arr){
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i]-1;
            if(arr[i] != arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
            else{
                i++;
            }
        }   
    }
}
