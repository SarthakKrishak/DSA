public class missing_Num_prac {
    public static void main(String[] args) {
        int[] arr = { 4, 1, 0, 2,5 };
        // we have to find the missing number and then return it.
        int result = missing(arr);
        System.out.println(result);
    }

    public static int missing(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i]<arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }
        }
        return -1;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
