class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if (index == -1) return word;
        char[] chars = word.toCharArray();
        int left = 0, right = index;
        while (left < right) {
            char temp = chars[left]; chars[left++] = chars[right]; chars[right--] = temp;
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        System.out.println(new Solution().reversePrefix("abcdefd", 'd'));
    }
}
