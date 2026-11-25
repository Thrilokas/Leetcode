class Solution {
    public int maximumWealth(int[][] accounts) {
        int richest = 0;
        for (int[] account : accounts) {
            int wealth = 0;
            for (int money : account) wealth += money;
            richest = Math.max(richest, wealth);
        }
        return richest;
    }
    public static void main(String[] args) {
        System.out.println(new Solution().maximumWealth(new int[][]{{1,2,3},{3,2,1}}));
    }
}
