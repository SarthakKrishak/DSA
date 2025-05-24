public class simpleLinear {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5,10,-5,-20,90 };
        int target = 90;
        int result = LinearSearch(arr, target);
        System.out.println(result);
    }

    static int LinearSearch(int[] arr,int target) {
        if (arr.length == 0) {
            return -1;
        }
        
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }

}
