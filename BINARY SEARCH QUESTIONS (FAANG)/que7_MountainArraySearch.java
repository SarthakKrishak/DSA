public class que7_MountainArraySearch {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 8, 6, 3 };
        int target = 2;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {
        int peak = peakInMountainArray(arr);
        int first = binarySearch(arr, target, 0, peak);

        if (first == -1) {
            return binarySearch(arr, target, peak, arr.length - 1);
        }

        return first;
    }

    static int peakInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // You are in decreasing part of the array
                // So this may be the ans so that why we are doing the following thing.
                end = mid;

            } else {
                // You are in asending part of array
                start = mid + 1;
            }
        }
        // Now at last start and end both will point at the highest number.
        return start; // or we can return end also as both are pointing to the same number at last.
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } 
            else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
