class Solution {
    public String interpret(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.interpret("G()(al)"));
        System.out.println(sol.interpret("G()()()()(al)"));
        System.out.println(sol.interpret("(al)G(al)()()G"));
    }
}
