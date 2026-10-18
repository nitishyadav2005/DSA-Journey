
class Solution {
    static int square(int n) {
        int sum = 0;
        int p = n;

        while (p > 0) {
            int rem = p % 10;
            sum += rem * rem;
            p /= 10;
        }

        return sum;
    }

    public boolean isHappy(int n) {
        while (n != 1 && n != 4) {
            n = square(n);
        }

        return n == 1;
    }
}
