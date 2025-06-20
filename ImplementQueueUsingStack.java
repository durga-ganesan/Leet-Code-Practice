class MyQueue {
    Stack<Integer> ip = new Stack();
    Stack<Integer> op = new Stack();
    
    public void push(int x) {
        ip.push(x);
    }
    
    public int pop() {
        peek();
        return op.pop();
    }
    
    public int peek() {
        if (op.empty())
            while (!ip.empty())
                op.push(ip.pop());
        return op.peek();
    }
    
    public boolean empty() {
        return ip.empty() && op.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
