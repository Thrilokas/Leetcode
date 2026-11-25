class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for (char c : letters) {
            if (c > target) {
                return c;
            }
        }

        return letters[0];
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(
            sol.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'a')
        );

        System.out.println(
            sol.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'c')
        );

        System.out.println(
            sol.nextGreatestLetter(new char[]{'x', 'x', 'y', 'y'}, 'z')
        );
    }
}
