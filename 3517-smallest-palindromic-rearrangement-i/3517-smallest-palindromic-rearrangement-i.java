class Solution {
    public String smallestPalindrome(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        char[] ans = new char[n/2];;
        for(int i=0; i<(n/2); i++){
            ans[i]=arr[i];
        }
        Arrays.sort(ans);
        for(int i=0; i<n/2; i++){
            arr[i] = ans[i];
        }
        for (int i = 0; i < n / 2; i++) {
            arr[n - 1 - i] = ans[i];
        }
         s = new String(arr);
         return s;
        
        }
}