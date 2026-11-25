class Solution {
    public int countDigits(int num) {
        int count = 0;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;

            if (num % digit == 0) {
                count++;
            }

            temp /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.countDigits(7));
        System.out.println(sol.countDigits(121));
        System.out.println(sol.countDigits(1248));
    }
}
