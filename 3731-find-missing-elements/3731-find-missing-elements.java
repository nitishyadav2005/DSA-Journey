class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList();
        int n = nums.length;
        Arrays.sort(nums);
        int j=0;
        for(int i=nums[0]; i<=nums[n-1]; i++){
            while(j<n){
                if(nums[j] != i){
                    ans.add(i);
                }
                else
                j++;
                break;
            }
        }
        return ans;
    }
}