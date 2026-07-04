class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        if(n < 2) return ans;
        int i=0,j=1;
        while(j<n){
            if(nums[i] != nums[j]){
                i++;
                j++;
            }
            else{
            ans.add(nums[i]);
            i++;
            j++;
            }
        }
        return ans;
    }
}