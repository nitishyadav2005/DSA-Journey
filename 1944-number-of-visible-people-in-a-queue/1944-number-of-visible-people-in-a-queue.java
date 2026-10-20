class Solution {
    public int[] canSeePersonsCount(int[] arr) {
        int n = arr.length;
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();
        ans[n-1] = 0;
        st.push(arr[n-1]);
        int cnt = 0;
        for(int i = n-2; i>=0; i--){
            while(st.size()>0 && st.peek()<arr[i]){
                st.pop();
                cnt++;
            }
            if( st.size()>0 && arr[i] < st.peek()) cnt++;
            st.push(arr[i]);
            ans[i] = cnt;
            cnt = 0;
        }
        return ans;
    }
}