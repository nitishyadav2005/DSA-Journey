class Solution {
    public int subtractProductAndSum(int n) {
        int prod = 1;
        int sum = 0;
        int p = n;
        while(p>0){
            prod *= p%10;
            p /= 10;
        }
        while(n>0){
            sum += n%10;
            n /= 10;
        }
        return (prod-sum);
    }
}