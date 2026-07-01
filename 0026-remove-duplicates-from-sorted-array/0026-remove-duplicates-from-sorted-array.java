class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = 0; j<nums.length; j++){
            if(i < 1 || nums[j] > nums[i-1]){
        
        nums[i] = nums[j];
        i++;
    }
}
return i;
    }
}