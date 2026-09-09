class Solution {
    public long countCommas(long n) {
        if(n<1000) return 0;
    long totalCommas = 0;
    for (long power = 1000; power <= n; power *= 1000) {
    totalCommas += n - power + 1;
      }
      return totalCommas;
    }
}