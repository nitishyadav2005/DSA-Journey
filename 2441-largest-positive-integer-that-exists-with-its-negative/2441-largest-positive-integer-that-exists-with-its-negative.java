class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > 0) {
                int target = -nums[i];

                if (Arrays.binarySearch(nums, 0, i, target) >= 0) {
                    return nums[i];
                }
            }
        }

        return -1;
    }
}