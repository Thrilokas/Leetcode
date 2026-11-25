class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) return false;
        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) return true;
            if (matrix[row][col] > target) col--;
            else row++;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] m = {{1,4,7,11},{2,5,8,12},{3,6,9,16},{10,13,14,17}};
        System.out.println(new Solution().searchMatrix(m, 5));
    }
}
