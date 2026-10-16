class Solution {
    public int countDigits(int num) {
        int cnt = 0;
        int p = num;
        while(p>0){
            int n = p%10;
            if(num % n == 0) cnt ++;
            p /= 10;
        }
        return cnt;
    }
}