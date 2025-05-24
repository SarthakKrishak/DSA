//Asked in Google

public class AllmissingNum {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 2, 1,3 ,7 };
        int reult = missingNum(arr);
        System.out.println(reult);
    }

    static int missingNum(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i]<arr.length && arr[i] != arr[correctIndex]) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }
        
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return j+1;
            }
        }
        return 0;
    }
}
