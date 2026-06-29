class Solution {
    public void merge(int[] a, int m, int[] b, int n) {
        int ans[] = new int[m+n];
        int i=0, j=0, k=0;
        while(i<m && j<n){
            if( a[i] <= b[j] ){
                ans[k++] = a[i++];
            }
            else if(a[i] > b[j]){
                ans[k++] = b[j++];
            }
        }
            while(i<m){
                ans[k++] = a[i++];
            }
            while(j<n){
                ans[k++] = b[j++];
            }
            for(i=0; i<m+n; i++){
                a[i] = ans[i];
            }
    }
}