class Solution {
    public String addStrings(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        int c = 0;
        StringBuilder sb = new StringBuilder();
        while(i>=0 || j>=0){
            int sum = c;
            if(i>=0){
                sum += a.charAt(i) - '0';
                i--;
            }
            if(j>=0){
                sum += b.charAt(j) - '0';
                j--;
            }
            sb.append(sum%10);
            c = sum/10;
        }
        if(c != 0) sb.append(c);
        return sb.reverse().toString();
    }
}