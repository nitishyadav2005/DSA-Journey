class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int i = 0, j = n - 1;

        while (i < j) {
            char ch1 = arr[i];
            char ch2 = arr[j];

            if ((ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u'
                    || ch1 == 'A' || ch1 == 'E' || ch1 == 'I' || ch1 == 'O' || ch1 == 'U')
                    &&
                (ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u'
                    || ch2 == 'A' || ch2 == 'E' || ch2 == 'I' || ch2 == 'O' || ch2 == 'U')) {

                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }

            else if ((ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u'
                    || ch1 == 'A' || ch1 == 'E' || ch1 == 'I' || ch1 == 'O' || ch1 == 'U')
                    &&
                    (ch2 != 'a' && ch2 != 'e' && ch2 != 'i' &&
                     ch2 != 'o' && ch2 != 'u' &&
                     ch2 != 'A' && ch2 != 'E' && ch2 != 'I' &&
                     ch2 != 'O' && ch2 != 'U')) {

                j--;
            }

            else {
                i++;
            }
        }

        return new String(arr);
    }
}