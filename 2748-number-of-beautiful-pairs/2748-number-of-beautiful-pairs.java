class Solution {
    static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b, a%b);
    }
    public int countBeautifulPairs(int[] nums) {
        int cnt = 0;
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                int first = nums[i];
                while (first >= 10) {
                    first = first / 10;
                }

                int last = nums[j] % 10;

                if (gcd(first, last) == 1) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}