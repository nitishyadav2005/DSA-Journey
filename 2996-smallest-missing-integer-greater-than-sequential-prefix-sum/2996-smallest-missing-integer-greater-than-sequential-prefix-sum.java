class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];
        int idx = nums.length - 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                idx = i - 1;
                break;
            }
        }

        sum = 0;

        for (int i = 0; i <= idx; i++) {
            sum += nums[i];
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (sum == nums[i]) {
                sum++;
            }
        }

        return sum;
    }
}