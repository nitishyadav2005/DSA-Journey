class Solution {
    static void swap(int []a, int x, int y){
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
    public void sortColors(int[] nums) {
        int low = 0, high = nums.length-1, mid = 0;
        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums, mid, low);
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid ++;
            }
            else{
                swap(nums, mid, high);
                high--;
            }
        }
    }
}