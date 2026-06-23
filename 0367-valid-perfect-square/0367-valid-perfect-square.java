class Solution {
    public boolean isPerfectSquare(int num) {
        long st = 0, end = num;
        while(st<=end){
            long mid = st + (end - st)/2;
            long val = mid * mid;
            if( val == num) return true;
            if(val > num){
                end = mid-1;
            }
            else
            st = mid+1;
        }
        return false;
    }
}