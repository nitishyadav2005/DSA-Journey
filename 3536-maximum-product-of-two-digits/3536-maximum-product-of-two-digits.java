class Solution {
    public int maxProduct(int n) {
        int cnt = 0;
        int dig = n;
        while(n>0){
            n /= 10;
            cnt++;
        }
        int arr[] = new int[cnt];
        for(int i=0; i<cnt; i++){
            arr[i] = dig%10;
            dig /= 10;
        }
        Arrays.sort(arr);
        int prod1 = arr[cnt-1]*arr[cnt-2];
        int prod2 = arr[0]*arr[1];
        return Math.max(prod1, prod2);
    }
}