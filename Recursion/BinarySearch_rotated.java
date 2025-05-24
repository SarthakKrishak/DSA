// In this prog we are doing the rotated binary search program with all the end cases.

public class BinarySearch_rotated {
    public static void main(String[] args) {
        int[] arr = { 5,6,7,8,9,1,2,3 };
        System.out.println(search(arr,8,0,arr.length-1));
    }

    static int search(int[] arr, int target, int s, int e) {
        //Base condition
        if (s > e) {
            return -1;
        }
        //mid index (We are writing in this way because we are trying to avoid the Integer overflow)
        int m = s + (e - s) / 2;

        if (arr[m] == target) {
            return m;
        }
        if (arr[s] <= arr[m]) {
            if (target >= arr[s] && target <= arr[m]) {
                return search(arr, target, s, m - 1);
            } else {
                return search(arr, target, m + 1, e);
            }
        }
        
        if (target >= arr[m] && target <= arr[e]) {
            return search(arr, target, m+1,e);
        } else {
            return search(arr, target, s, m-1);
        }
    }
}
