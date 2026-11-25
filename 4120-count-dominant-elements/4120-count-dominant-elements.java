class Solution {
    public int countDominantElements(int[] nums) {
        int cnt = 0;
        int n = nums.length;
        if(n == 1) return 1;
        else{
        if(nums[0] >= nums[1]) cnt++;
        if(nums[n-1] >= nums[n-2]) cnt++;
        }
        for(int i=1; i<n-1; i++){
            if((nums[i-1]+nums[i+1]) / 2.0 <= nums[i] ){
                cnt++;
            } 
        }
        return cnt;
    }
}