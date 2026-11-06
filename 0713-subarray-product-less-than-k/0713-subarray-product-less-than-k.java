class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
        int n = arr.length;
        int cnt = 0;
        for(int i=0; i<n-1; i++){
            if(arr[i] < k) cnt++;
            int j = i+1;
             int prd = arr[i];
            while(j<n){
                prd *= arr[j++];
                if(prd < k) cnt++;
                else
                break;
            }
        }
        if(arr[n-1] < k) cnt++;
        return cnt;
    }
}