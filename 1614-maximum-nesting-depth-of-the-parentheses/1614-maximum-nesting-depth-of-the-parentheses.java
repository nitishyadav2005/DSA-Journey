class Solution {
    public int maxDepth(String s) {
        int n = s.length();
        int count = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));

                if (stack.size() > count) {
                    count = stack.size();
                }
            }
            else if (s.charAt(i) == ')') {
                stack.pop();
            }
        }

        return count;
    }
}