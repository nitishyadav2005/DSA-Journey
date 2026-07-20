class Solution {
    public int[] shuffle(int[] nums, int n) {
        int m = nums.length;
        int ans[] = new int[m];
        int k = 0;
        for(int i=0; i<n; i++){
            ans[k] = nums[i];
            k += 2;
        }
        int l = 1;
        for(int i=n; i<m; i++){
            ans[l] = nums[i];
            l += 2;
        }
        return ans;
    }
}