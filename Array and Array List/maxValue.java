public class maxValue {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 30, 4, 5 };

        System.out.println(max(arr));
    }

    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }


}
