class Solution {
    public int findNumbers(int[] nums) {
        int cnt = 0;
        int dig = 0;
        for(int i=0; i<nums.length; i++){
            int n = nums[i];
            while(n>0){
                n /= 10;
                dig++;
            }
            if(dig%2 == 0) cnt++;
            dig = 0;
        }
        return cnt;
    }
}