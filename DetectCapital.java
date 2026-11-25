class Solution {
    public boolean detectCapitalUse(String word) {
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                count++;
            }
        }

        if (count == 0 || count == word.length()) {
            return true;
        }

        if (count == 1 && Character.isUpperCase(word.charAt(0))) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.detectCapitalUse("USA"));
        System.out.println(sol.detectCapitalUse("FlaG"));
        System.out.println(sol.detectCapitalUse("Google"));
        System.out.println(sol.detectCapitalUse("leetcode"));
    }
}
