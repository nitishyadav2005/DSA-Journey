class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int k = 0, cnt = 0;;
        for(int i=0; i<n; i++){
            int j=0;
            while(j<n){
                if(nums[i] > nums[j]){
                    cnt++;
                    j++;
                }
                else
                j++;
            }
            ans[k++] = cnt;
            cnt = 0;
        }
        return ans;
    }
}