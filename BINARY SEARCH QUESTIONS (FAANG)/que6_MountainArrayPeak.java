//Its also known as Bitonic array.

public class que6_MountainArrayPeak {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5,8, 4, 3, 2 };
        System.out.println(peakInMountainArray(arr));
    }

    static int peakInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                //You are in decreasing part of the array 
                //So this may be the ans so that why we are doing the following thing.
                end = mid;

            } else {
                //You are in asending part of array
                start = mid + 1;
            }
        }
        //Now at last start and end both will point at the highest number.
        return arr[start]; //or we can return end also as both are pointing to the same number at last.
    }
}
