class Solution {
    public boolean checkString(String s) {
        int bfst = -1;
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i) == 'b'){
                bfst = i;
                break;
            }
        }
        int afst = -1;
        for(int i =s.length()-1; i>=0; i--){
            if(s.charAt(i) == 'a'){
                afst = i;
                break;
            }
        }
        if(afst == -1) return true;
        if(bfst == -1) return true;
        if(afst>bfst) return false;
        return true;
    }
}