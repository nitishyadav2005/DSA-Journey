class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int ans[] = new int[n];
        int k=0;
        for(int i=0; i<n; i++){
            if(k<n){
            ans[k++] = arr[i];
            if(arr[i] == 0 && k<n){
                ans[k++] = 0;
            }
        }
        }
        for(int i=0; i<n; i++){
            arr[i] = ans[i];
        }
    }
}