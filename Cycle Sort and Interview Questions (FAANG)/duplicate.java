//Microsoft interview question,

public class duplicate {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 2 };
        int result = duplicate(arr);
        System.out.println(result);
    }
    
    static int duplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            
            if (arr[i] != i + 1) {
                int correctIndex = arr[i] - 1;
                if (arr[i] != arr[correctIndex]) {
                    int temp = arr[i];
                    arr[i] = arr[correctIndex];
                    arr[correctIndex] = temp;
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }
}
