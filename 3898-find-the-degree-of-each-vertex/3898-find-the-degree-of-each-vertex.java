class Solution {
    public int[] findDegrees(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int ans[] = new int[n];
        int k=0;
        for(int i=0; i<m; i++){
            int cnt = 0;
            for(int j=0; j<n; j++){
                if(matrix[i][j] == 1){
                    cnt++;
                }
            }
            ans[k++] = cnt;
        }
        return ans;
    }
}