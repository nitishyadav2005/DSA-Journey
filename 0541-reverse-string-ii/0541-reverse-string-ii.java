class Solution {
    public String reverseStr(String s, int k) {

        int n = s.length();
        char[] arr = s.toCharArray();

        int i = 0;

        while (i < n) {

            int j;
            if (i + k > n) {
                j = n - 1;
            } else {
                j = i + k - 1;
            }

            int left = i;
            int right = j;

            while (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }

            i += 2 * k;
        }

        return new String(arr);
    }
}