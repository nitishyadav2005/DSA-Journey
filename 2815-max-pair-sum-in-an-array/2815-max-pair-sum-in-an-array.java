class Solution {
    static int maxDig(int num){
        int p = num;
        int max = Integer.MIN_VALUE;
        while(p>0){
            int rem = p%10;
            max = Math.max(rem, max);
            p /= 10;
        }
        return max;
    }
    public int maxSum(int[] nums) {
        int n = nums.length;
        int sum = -1;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(maxDig(nums[i]) == maxDig(nums[j])){
                    sum = Math.max(sum, nums[i] + nums[j]);
                }
            }
        }
        return sum;
    }
}