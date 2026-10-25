class MinStack {
    Stack<Long> st;
    long min;
    public MinStack() {
    st = new Stack<>();
    min = Integer.MAX_VALUE;
    }
    
    public void push(int value) {
        if(st.size() == 0) min = (long)value;
        if((long)value < min){
            st.push((long)value + (long)value - min);
            min = (long)value;
        } else{
            st.push((long)value);
        }
    }
    
    public void pop() {
        if(st.peek() < min){
            min = min + (min - st.peek());
        }
        st.pop();
    }
    
    public int top() {
        long a = st.peek();
        if(a < min){
            return (int)min;    
        }
        return (int)a;
    }
    
    public int getMin() {
        return (int)min;
    }
}
// class MinStack {
//     Stack<Integer> st;
//     Stack<Integer> minSt;

//     public MinStack() {
//     st = new Stack<>();
//     minSt = new Stack<>();
//     }
    
//     public void push(int value) {
//         st.push(value);
//         if(minSt.size()==0 || value<minSt.peek()){
//             minSt.push(value);
//         } else{
//             minSt.push(minSt.peek());
//         }
//     }
    
//     public void pop() {
//         st.pop();
//         minSt.pop();
//     }
    
//     public int top() {
//         return st.peek();
//     }
    
//     public int getMin() {
//         return minSt.peek();
//     }
// }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */