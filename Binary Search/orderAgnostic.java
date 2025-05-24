//We first check wheather the array is sorted in assending order or descending, after that we apply search.

public class orderAgnostic {
    public static void main(String[] args) {
        //ascending array
        // int[] arr = { 1, 2, 3, 4, 5, 6 };

        //descending array
        int[] arr = { 6, 5, 4, 3, 2, 1 };
        int ans = check(arr, 6);
        System.out.println(ans);
        
    }

    static int check(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
            // In this case
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }
            else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }
        }
        return -1;

    }
}
