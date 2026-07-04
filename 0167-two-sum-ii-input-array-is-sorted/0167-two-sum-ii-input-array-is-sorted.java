class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int i=0, j = n-1;
        int ans[] = {};
        while(i<j){
           int sum = numbers[i] + numbers[j];
            if(sum == target) return new int[]{i+1,j+1};
            else if(numbers[j] > target && numbers[i] > 0) j--;
            else if(sum < target) i++;
            else
            j--;
        }
        return ans;
    }
}