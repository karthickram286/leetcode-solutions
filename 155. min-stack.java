class MinStack {
    
    // Storing both the stack value and the minimum value seen so far 
    private Stack<Pair<Integer, Integer>> stack;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        // For the first element its also the smallest value
        if (stack.isEmpty())
            stack.push(new Pair<>(val, val));
        else
            // We should also check the minimum value seen so far before assigning the min value
            stack.push(new Pair<>(val, Math.min(val, stack.peek().getValue())));
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek().getKey();
    }
    
    public int getMin() {
        return stack.peek().getValue();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
