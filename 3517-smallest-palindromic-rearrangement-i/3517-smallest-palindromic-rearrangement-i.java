class Solution {
    public String smallestPalindrome(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        Arrays.sort(arr,0,n/2);
        for (int i = 0; i < n / 2; i++) {
            arr[n - 1 - i] = arr[i];
        }
         s = new String(arr);
         return s;
        
        }
}