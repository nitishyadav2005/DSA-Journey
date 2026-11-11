class Solution {
    public int reverseBits(int n) {
        String b = Integer.toBinaryString(n);
         b = String.format("%32s", b).replace(' ', '0');
         char[] arr = b.toCharArray();
        int t = arr.length;
        int i = 0;
        int j = t-1;
        while(i<j){
            char ch = arr[i];
            arr[i] = arr[j];
            arr[j] = ch;
            i++;
            j--;
        }
        String ans = new String(arr);

        return (int) Long.parseLong(ans, 2);
    }
}