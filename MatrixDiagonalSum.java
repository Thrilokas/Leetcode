class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0, n = mat.length;
        for (int i = 0; i < n; i++) {
            sum += mat[i][i];
            sum += mat[i][n - 1 - i];
        }
        if (n % 2 == 1) sum -= mat[n / 2][n / 2];
        return sum;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.diagonalSum(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
    }
}
