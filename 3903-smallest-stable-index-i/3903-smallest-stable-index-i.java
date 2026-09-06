class Solution {

    static int findMax(int[] arr, int i, int j) {
        int maxValue = Integer.MIN_VALUE;

        for (int k = i; k <= j; k++) {
            maxValue = Math.max(arr[k], maxValue);
        }

        return maxValue;
    }

    static int findMin(int[] arr, int i, int j) {
        int minValue = Integer.MAX_VALUE;

        for (int k = i; k <= j; k++) {
            minValue = Math.min(arr[k], minValue);
        }

        return minValue;
    }

    public int firstStableIndex(int[] nums, int k) {

        for (int i = 0; i < nums.length; i++) {

            int maxValue = findMax(nums, 0, i);
            int minValue = findMin(nums, i, nums.length - 1);

            if (maxValue - minValue <= k) {
                return i;
            }
        }

        return -1;
    }
}