class Solution {
    public String reverseWords(String s) {
        int cnt = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != ' ')
                cnt++;

            if (i < s.length() - 1 && s.charAt(i + 1) == ' ') {
                for (int j = i; j > i - cnt; j--) {
                    sb.append(s.charAt(j));
                }
                sb.append(' ');
                cnt = 0;
            }
        }

        int j = s.length() - 1;
        while (j >= 0 && s.charAt(j) != ' ') {
            sb.append(s.charAt(j));
            j--;
        }

        return sb.toString();
    }
}