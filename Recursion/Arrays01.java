//🔴 Checking wheather the Array is sorted or not using recursion.

public class Arrays01 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5,1 };
        System.out.println(sortedorNot(arr,0));
    }

    static boolean sortedorNot(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        return arr[index] < arr[index + 1] && sortedorNot(arr, index + 1);
    }
    
}
 