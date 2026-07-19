class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int digits = 0;
        for(int i=0; i<n; i++){
            sum += nums[i];

            while(nums[i] > 0){
                int rem = nums[i]%10;
                digits += rem;
                nums[i] /= 10;
            }
        }
        return Math.abs(sum-digits);
    }
}