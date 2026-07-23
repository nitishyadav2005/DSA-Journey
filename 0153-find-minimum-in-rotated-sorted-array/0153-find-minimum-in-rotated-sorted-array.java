class Solution {
    public int findMin(int[] a) {
        int n = a.length;
        int st =0, end = a.length-1;
        int ans = -1;
        while(st <= end){
            int mid = st + (end - st)/2;
            if(a[mid] <= a[n-1]){
                end = mid-1;
                ans = a[mid];
            }
            else
            st = mid+1;
        }
        return ans;
    }
}