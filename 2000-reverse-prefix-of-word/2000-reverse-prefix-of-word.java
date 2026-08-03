class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        int cnt = 0;

        for (int i = 0; i < word.length(); i++) {
            cnt++;

            if (word.charAt(i) == ch) {
                for (int j = i; j >= 0; j--) {
                    sb.append(word.charAt(j));
                }

                for (int k = cnt; k < word.length(); k++) {
                    sb.append(word.charAt(k));
                }

                return sb.toString();
            }
        }

        // ch not found
        return word;
    }
}