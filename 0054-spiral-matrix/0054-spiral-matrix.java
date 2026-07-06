class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int cnt = 0;
        int leftCol = 0, rightCol = n-1, topRow = 0, bottomRow = m-1;
        while(cnt < m*n){
            for(int i = leftCol; i<= rightCol && cnt < m*n; i++){
                ans.add(matrix[topRow][i]);
                cnt++;
            }
            topRow++;

            for(int i = topRow; i<= bottomRow  && cnt < m*n; i++){
                ans.add(matrix[i][rightCol]);
                cnt++;
            }
            rightCol--;

            for(int i = rightCol; i >= leftCol  && cnt < m*n; i--){
                ans.add(matrix[bottomRow][i]);
                cnt++;
            }
            bottomRow--;

            for(int i = bottomRow; i>= topRow  && cnt < m*n; i--){
                ans.add(matrix[i][leftCol]);
                cnt++;
            }
            leftCol++;
        }
        return ans;
    }
}