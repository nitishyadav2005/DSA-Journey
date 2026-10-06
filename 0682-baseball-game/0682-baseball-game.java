class Solution {
    public int calPoints(String[] arr) {
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<arr.length; i++){
            String s = arr[i];
            if(s.equals("C")) st.pop();
            else if(s.equals("D")) st.push(2*st.peek());
            else if(s.equals("+")){
                int a = st.pop();
                int b = st.pop();
                int sum = a+b;
                st.push(b);
                st.push(a);
                st.push(sum);
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        int tot = 0;
        for(int x : st){
            tot += x;
        }
        return tot;
    }
}