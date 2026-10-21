class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=left; i<=right; i++){
            boolean flag = true;
            int n = i;
            while(n>0){
                int rem = n%10;
                if(rem == 0 || i % rem  != 0){
                    flag = false;
                }
                n /= 10;
            }
            if(flag) ans.add(i);
        }
        return ans;
    }
}