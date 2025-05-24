//Ceiling of a number

//Ceiling --> smallest element that is greater than or equal to the target element.

public class que1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,9,11,15,20};
        int target = 19;
        int ans = ceil(arr, target);
        System.out.println(ans);
    }
    
    static int ceil(int []arr , int target){
        int start = 0;
        int end = arr.length - 1;

        if (target > arr[end]) {
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > target) {
                end = mid - 1;
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }

        return arr[start];
    }
}
