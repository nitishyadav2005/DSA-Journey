class Solution {
    public int[] fairCandySwap(int[] alice, int[] bob) {
        int m = alice.length;
        int n = bob.length;
        int sumA = 0, sumB = 0;
        for(int i=0; i<m; i++){
            sumA += alice[i];
        }
        for(int i=0; i<n; i++){
            sumB += bob[i];
        }
        int diff = (sumA - sumB)/2;
        HashSet<Integer> set = new HashSet<>();
        for(int y : bob){
            set.add(y);
        }
        for(int x : alice){
        int y = x-diff;

        if(set.contains(y)) return new int[]{x,y};
    }
    return new int[0];
    }
}