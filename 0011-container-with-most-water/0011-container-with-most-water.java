class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int max = 0;
        int i=0, j = n-1;
        while(i<j){
            int ans = 0;
            if(height[i] < height[j]){
                ans = height[i] * (j-i);
                i++;
            }
            else{
                ans = height[j] * (j-i);
                j--;
            }
            if(ans > max){
                max = ans;
            }
        }
        return max;
    }
}