public class BinarySearch_05 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 56, 6 };
        System.out.println(search(arr, 56, 0, arr.length - 1));
    }

    static int search(int[] arr, int target, int s, int e) {
        if (arr.length == 0) {
            return -1;
        }
        // as our start pointer is greater than end pointer so we didn't find out target
        if (s > e) {
            return -1;
        }
        // Middle
        int m = s + (e - s) / 2;

        if (arr[m] == target) {
            return m;
        }
        if (target < arr[m]) {

            //We are writing return here as we have to return the value because this whole function is returning something
            return search(arr, target, s, m - 1);
        }
        return search(arr, target, m + 1, e);
    }
}
