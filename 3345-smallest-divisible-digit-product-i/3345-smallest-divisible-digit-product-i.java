class Solution {
    public int smallestNumber(int n, int t) {
        for( int i=n; i<=100; i++){
            int digPro = 1;
            int temp = i;
            while(temp>0){
              digPro *= temp%10;
              temp /= 10;
        }
           if(digPro % t == 0){
            return i;
           }
        }
        return -1;
    }
}