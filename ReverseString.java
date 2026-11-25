import java.util.Arrays;
class Solution {
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left]; s[left++] = s[right]; s[right--] = temp;
        }
    }
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        new Solution().reverseString(s);
        System.out.println(Arrays.toString(s));
    }
}
