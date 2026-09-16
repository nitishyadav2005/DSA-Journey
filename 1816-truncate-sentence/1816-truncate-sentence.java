class Solution {
    public String truncateSentence(String s, int k) {
        int l=s.length();
        int c=0;
        String ans="";
        for(int i=0;i<l;i++){
            if(s.charAt(i)==' '){
                c++;
                if(c==k){
                    break;
                }
            }
             ans+=s.charAt(i);
        }
        return ans;
    }
}