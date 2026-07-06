class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length <= 0) return 0;
        int cnt = 1;
        int ans = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1] + 1 == nums[i]){
                cnt++;
                ans = Math.max(ans, cnt);
            }
            else if(nums[i-1] == nums[i]) continue;
            else{
                ans = Math.max(ans, cnt);
                cnt = 1;
            }
        }
        return ans;
    }
}