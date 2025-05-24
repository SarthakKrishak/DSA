//Asked in AMAZON

public class missingNum {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 0 };
        int result = cyclicSort(arr);
        System.out.println(result);
    }

    static int cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[arr[i]]) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }

        // Search for number
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }
        }
        return arr.length;
    }
}
