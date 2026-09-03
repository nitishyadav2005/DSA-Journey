class Solution {
    public boolean isPalindromic(String s) {

        StringBuilder bin = new StringBuilder();

        for (char c : s.toCharArray()) {
            String b = Integer.toBinaryString(c);

            while (b.length() < 8) {
                b = "0" + b;
            }

            bin.append(b);
        }
        
        int n = bin.length();
        int i=0, j=n-1;
        while(i<j){
            if(bin.charAt(i) != bin.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}