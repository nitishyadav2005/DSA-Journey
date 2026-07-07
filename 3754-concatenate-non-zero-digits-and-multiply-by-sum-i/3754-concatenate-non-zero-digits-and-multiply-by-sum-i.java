class Solution {
    public long sumAndMultiply(int n) {
        long x=0, p=1;
        while(n>0){
            long rem = n%10;
            if(rem != 0){
                x += p*rem;
                p *= 10;
            }
            n /= 10;
        }
        long temp = x;
        long sum = 0;
        while(x>0){
            sum += x%10;
            x /= 10;
        }
        return temp*sum;
    }
}