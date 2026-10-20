class Solution {
    public int[] canSeePersonsCount(int[] arr) {
        int n = arr.length;
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = n-1; i>=0; i--){
            while(st.size()>0 && st.peek()<arr[i]){
                st.pop();
                ans[i]++;
            }
            if( st.size()>0) ans[i]++;
            st.push(arr[i]);
        }
        return ans;
    }
}