class Solution {
    public int commonFactors(int a, int b) {
        int cnt = 0;
        int lim = Math.min(a,b);
        for(int i=1; i<=lim; i++){
            if(a%i == 0 && b%i == 0) cnt++;
        }
        return cnt;
    }
}