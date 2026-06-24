class Solution {
    public int missingNumber(int[] nums) {

        int ans = nums.length;  // n

        for (int i = 0; i < nums.length; i++) {
            ans = ans ^ i ^ nums[i];
        }

        return ans;
    }
}