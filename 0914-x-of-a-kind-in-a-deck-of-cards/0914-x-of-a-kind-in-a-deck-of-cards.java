class Solution {
    public boolean hasGroupsSizeX(int[] deck) {

        int max = Integer.MIN_VALUE;
        for(int i=0; i<deck.length; i++){
            max = Math.max(deck[i], max);
        }
        int freq[] = new int[max+1];
        for (int i = 0; i < deck.length; i++) {
            freq[deck[i]]++;
        }

        int gcd = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                gcd = findGCD(gcd, freq[i]);
            }
        }

        return gcd >= 2;
    }

    private int findGCD(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}