public class findMin {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 8, 1, 0 };
        System.out.println(MinNumber(arr));

    }

    static int MinNumber(int[] arr) {
        int min = arr[0];
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
