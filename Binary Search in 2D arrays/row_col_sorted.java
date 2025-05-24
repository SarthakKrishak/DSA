public class row_col_sorted {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 4 }, {2,7,5},{8,9,10} };
        int target = 7;
        searchNum(matrix, target);
    }
    

    static int[] searchNum(int[][]matrix,int target){
        int r = 0;
        int c = matrix.length - 1;

        while(r<matrix.length && c>=0){
            if(matrix[r][c] == target){
                return new int[]{r,c};
            }

            if(matrix[r][c]<target){
                r++;
            }
            else{
                c--;
            }
        }

        return new int[]{-1,-1};
    }
}
