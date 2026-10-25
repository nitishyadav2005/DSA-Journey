
import java.util.*;

class Solution {

    static int[] pse(int[] arr) {
        int n = arr.length;
        int pse[] = new int[n];
        pse[0] = -1;

        Stack<Integer> st = new Stack<>();
        st.push(0);

        for (int i = 1; i < n; i++) {
            while (st.size() > 0 && arr[st.peek()] >= arr[i])
                st.pop();

            if (st.size() == 0)
                pse[i] = -1;
            else
                pse[i] = st.peek();

            st.push(i);
        }
        return pse;
    }

    static int[] nse(int[] arr) {
        int n = arr.length;
        int nse[] = new int[n];
        nse[n - 1] = n;

        Stack<Integer> st = new Stack<>();
        st.push(n - 1);

        for (int i = n - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[st.peek()] >= arr[i])
                st.pop();

            if (st.size() == 0)
                nse[i] = n;
            else
                nse[i] = st.peek();

            st.push(i);
        }
        return nse;
    }

    static int getMaxArea(int[] arr) {
        int n = arr.length;
        int[] pse = pse(arr);
        int[] nse = nse(arr);

        int max = 0;

        for (int i = 0; i < n; i++) {
            int area = arr[i] * (nse[i] - pse[i] - 1);
            max = Math.max(area, max);
        }
        return max;
    }

    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0)
            return 0;

        int m = matrix[0].length;
        int n = matrix.length;

        int[] arr = new int[m];
        int max = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == '1') {
                    arr[j] += 1;
                } else {
                    arr[j] = 0;
                }
            }

            int area = getMaxArea(arr);
            max = Math.max(max, area);
        }

        return max;
    }
}
