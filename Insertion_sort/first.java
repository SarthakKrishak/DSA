import java.util.Arrays;

public class first{
    public static void main(String[] args) {
        int[] arr = { 5, 4, 2, 1, 3,-1,0 };
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr) {
        //Here we have taken arr.length-1 as we are giving values of j till i+1, otherwise it will give index outof bound error.
        for (int i = 0; i < arr.length-1; i++) {
           for (int j = i+1; j > 0; j--) {
               if (arr[j] < arr[j - 1]) {
                   int temp = arr[j];
                   arr[j] = arr[j - 1];
                   arr[j - 1] = temp;
               }
               else {
                break;
               }
           }
        }
    }
}