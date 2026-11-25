class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;

        for (int[] row : grid) {
            for (int num : row) {
                if (num < 0) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] grid = {
            {4, 3, 2, -1},
            {3, 2, 1, -1},
            {1, 1, -1, -2},
            {-1, -1, -2, -3}
        };

        System.out.println(sol.countNegatives(grid));
    }
}
