class Solution {
    public List<Boolean> kidsWithCandies(int[] arr, int a) {
        ArrayList<Boolean> ans = new ArrayList<>();
        int n = arr.length;
        int max = -1;
        for(int i=0; i<n; i++){
            max = Math.max(arr[i], max);
        }
        for(int i=0; i<n; i++){
            if((arr[i] + a) >=  max) ans.add(true);
            else
            ans.add(false);
        }
        return ans;
    }
}