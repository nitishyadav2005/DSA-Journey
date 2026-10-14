import java.util.*;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();

        Arrays.fill(nge, -1);

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            max = Math.max(nums[i], max);
        }

        for (int i = 2 * n - 1; i >= 0; i--) {
            int idx = i % n;

            while (!st.isEmpty() && st.peek() <= nums[idx]) {
                st.pop();
            }

            if (i < n && !st.isEmpty()) {
                nge[idx] = st.peek();
            }

            st.push(nums[idx]);
        }

        return nge;
    }
}