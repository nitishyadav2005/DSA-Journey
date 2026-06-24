class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int i = 0, j = 1;
        while(j<n){
            if(nums[i] == nums[j]) return nums[i];
            else 
            i++;
            j++;
        }
        return -1;
    }
}