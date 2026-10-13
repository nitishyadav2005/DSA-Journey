class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long sq[] = new long[n];
        for(int i=0; i<n; i++){
            sq[i] = (long)nums[i]*nums[i];
        }
        Arrays.sort(sq);
        long tot = 0;
        for(int i=0; i<n/2; i++){
            tot -= sq[i];
        }
        for(int i=n/2; i<n; i++){
            tot += sq[i];
        }
        return tot;
    }
}