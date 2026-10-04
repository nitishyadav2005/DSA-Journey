class Solution {
    public boolean hasGroupsSizeX(int[] deck) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < deck.length; i++) {
            map.put(deck[i], map.getOrDefault(deck[i], 0) + 1);
        }

        int frequency = 0;

        for (int value : map.values()) {
            frequency = gcd(frequency, value);
        }

        return frequency >= 2;
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }

        return a;
    }
}