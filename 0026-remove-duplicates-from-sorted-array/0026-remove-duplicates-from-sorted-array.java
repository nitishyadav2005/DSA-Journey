class Solution {
    public int removeDuplicates(int[] a) {
        int n = a.length;
        if(n==0) return 0;
        int i=0, j=1, k=0;
        int ans[] = new int[n];
        while(i<n && j<n){
            if(a[i] != a[j]){
                ans[k++] = a[i];
                i++;
                j++;
            }
            else{
                i++;
                j++;
            }
        }
        ans[k++] = a[n-1];
        for( i=0; i<n; i++){
            a[i] = ans[i];
        }
        return k;
    }
}