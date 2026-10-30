class Solution {

    static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public int countPrimeSetBits(int left, int right) {
        int ans = 0;

        for (int i = left; i <= right; i++) {
            String bin = Integer.toBinaryString(i);
            int cnt = 0;

            for (int j = 0; j < bin.length(); j++) {
                if (bin.charAt(j) == '1') {
                    cnt++;
                }
            }

            if (isPrime(cnt)) ans++;
        }

        return ans;
    }
}