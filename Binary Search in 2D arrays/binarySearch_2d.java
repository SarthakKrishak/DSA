public class binarySearch_2d {
    public static void main(String[] args) {

    }
    //search in the row provided btw the col provided
    static int[] binarySearch(int[][] matrix, int r, int cStart, int cEnd, int target) {
        int mid = cStart + (cEnd - cStart) / 2;
        if (matrix[r][mid] == target) {
            return new int[] { r, mid };
        }
        if (matrix[r][mid] < target) {
            cStart = mid + 1;
        } else {
            cEnd = mid - 1;
        }
        return new int[] { -1, -1 };
    }
    
    static int[] search(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;

        if (r == 1) {
            return binarySearch(matrix, 0, 0, c - 1, target);
        }
        int rStart = 0;
        int rEnd = r - 1;
        int cMid = c / 2;
        
        return new int[] { -1, -1 };
    }
}
