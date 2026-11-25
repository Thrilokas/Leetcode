import java.util.Arrays;
class Solution {
    public void moveZeroes(int[] nums) {
        int pos = 0;
        for (int n : nums) if (n != 0) nums[pos++] = n;
        while (pos < nums.length) nums[pos++] = 0;
    }
    public static void main(String[] args) {
        int[] a = {0,1,0,3,12};
        new Solution().moveZeroes(a);
        System.out.println(Arrays.toString(a));
    }
}
