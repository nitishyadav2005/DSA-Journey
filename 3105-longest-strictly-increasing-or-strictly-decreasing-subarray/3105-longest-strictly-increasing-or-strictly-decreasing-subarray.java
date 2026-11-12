class Solution {
    public int longestMonotonicSubarray(int[] nums) {

        int max = 1;

        for (int i = 0; i < nums.length; i++) {

            int count = 1;

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[j] > nums[j - 1]) {
                    count++;
                } else {
                    break;
                }
            }

            max = Math.max(max, count);

            count = 1;

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[j] < nums[j - 1]) {
                    count++;
                } else {
                    break;
                }
            }

            max = Math.max(max, count);
        }

        return max;
    }
}