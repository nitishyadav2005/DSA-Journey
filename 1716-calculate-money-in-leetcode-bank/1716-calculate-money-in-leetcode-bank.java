class Solution {
    public int totalMoney(int n) {
        int sum = 0;
        int val = 1;
        for(int i=0;i<n;i++){
            sum += (i%7) + val;
            if(i%7==6) val++;
        }
        return sum;
        
    }
}