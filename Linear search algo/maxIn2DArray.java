
public class maxIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 25, 6},
            {7, 8, 9}
        };
        System.out.println(max(arr));
    }
    
    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }

        //🔴Enhanced for loop
        // for (int[] element : arr) {
        //     for(int items:element){
        //         if (items > max) {
        //             max = items;
        //         }
        //     }
        // }

        return max;
    }
    
}
