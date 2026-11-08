class Solution {
    public int mostWordsFound(String[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {

          String[] words = arr[i].split(" ");
          ans = Math.max(words.length, ans);
            // for (int j = 0; j < words.length; j++) {
            //    System.out.println(words[j]);
            // }
        }
        return ans;
    }
}