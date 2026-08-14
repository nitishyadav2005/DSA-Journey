class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        int max = 0;

        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            int ans = 0;

            for (int j = i; j < n; j++) {
                freq[s.charAt(j) - 'a']++;

                if (freq[s.charAt(j) - 'a'] > 2) {
                    break;
                }

                ans++;
                max = Math.max(ans, max);
            }
        }

        return max;
    }
}