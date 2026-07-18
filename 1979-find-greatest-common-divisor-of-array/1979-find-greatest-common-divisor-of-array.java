class Solution {
    static int gcd(int x, int y){
        if(y == 0) return x;
        return gcd(y, x % y);
        }

    public int findGCD(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            min = Math.min(min, nums[i]);
        }
        for(int i=0; i<n; i++){
            max = Math.max(max, nums[i]);
        }
        return gcd(min, max);
        
    }
}