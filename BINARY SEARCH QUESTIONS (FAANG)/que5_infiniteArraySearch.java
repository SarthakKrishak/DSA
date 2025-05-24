//Simply dont use arr.length as by doing this we are imagining our array to be infinite.

//we can check in chunks in the array and after that we can apply binary search in that chunck.

//Now we can double the size of the chunck that we are checking so technically we are applying reverse binary search on that array.

public class que5_infiniteArraySearch {
    public static void main(String[] args) {
        int[] arr = { 3, 6, 8, 9, 10, 20, 50, 60, 77 };
        int target = 10;
        System.out.println(ans(arr,target));
    }

    static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;

        //This is checking wheather the element lies btw the window.
        while (target>arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}