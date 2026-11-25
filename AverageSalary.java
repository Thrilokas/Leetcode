class Solution {
    public double average(int[] salary) {
        int min = salary[0];
        int max = salary[0];
        int sum = 0;

        for (int s : salary) {
            sum += s;

            if (s < min) {
                min = s;
            }

            if (s > max) {
                max = s;
            }
        }

        sum = sum - min - max;

        return (double) sum / (salary.length - 2);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] salary = {4000, 3000, 1000, 2000};

        System.out.println(sol.average(salary));
    }
}
