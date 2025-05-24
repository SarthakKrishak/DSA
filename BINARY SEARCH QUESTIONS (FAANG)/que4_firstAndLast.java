import java.util.Arrays;

public class que4_firstAndLast {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3,5 ,5, 6 };
        int target = 5;
        System.out.println(Arrays.toString(count(arr, target)));
    }
    
    static  int[] count(int[] arr, int target) {
        int[] arr1 = { -1, -1 };

        arr1[0] = search(arr, target, true);
        arr1[1] = search(arr, target, false);

        return arr1;
    }
    
    static int search(int[] arr, int target, boolean findFirst) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }
            else {
                ans = mid;
                if (findFirst) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
