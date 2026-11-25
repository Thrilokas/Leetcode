class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int n : nums) if (n != val) nums[k++] = n;
        return k;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        System.out.println(new Solution().removeElement(nums, 3));
    }
}
