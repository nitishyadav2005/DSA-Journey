class Solution {
    public boolean checkDivisibility(int n) {
        int t = n;
        int sum = 0, prod = 1;
        while(n>0){
            sum += n%10;
            prod *= n%10;
            n /= 10;
        }
        int tot = sum + prod;
        if(t%tot == 0){
            return true;
        }
        return false;
    }
}