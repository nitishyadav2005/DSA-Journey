class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int m = word2.length();
        int n = word1.length();
        int a = Math.min(m,n); 
        int b = Math.max(m,n); 
        for(int i=0; i<a; i++){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        for(int i=a; i<b; i++){
            if(m > n){
                sb.append(word2.charAt(i));
            }
            else
            sb.append(word1.charAt(i));
        }
        String ans = sb.toString();
        return ans;
    }
}