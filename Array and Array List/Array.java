import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // int arr1[];
        // arr1 = new int[5];
        // System.out.println(arr1[0]);
        //We will get zero.

        // String arr2[] = new String[5];
        // System.out.println(arr2[1]);
        //We will get null here in this case.

// This is a way of taking input in a Array using loops.
        Scanner sc = new Scanner(System.in);
        // int arr[]=new int[5];

        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = sc.nextInt();
        // }
        // System.out.println("the element at index 1 is"+arr[1]);

        //Different ways to print a array.
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        //for every element in the array print the array.
        // for (int num : arr) {
        //     System.out.print(num + " ");
        // }

        // If you try to access a index which is not present in the array than it will give you a index out of bound error.
        // System.out.println(arr[6]);

        // This is the best method to print array.
        // System.out.println(Arrays.toString(arr));


        String str[] = new String[4];

        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));

    }

    static boolean toString(int[] a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
