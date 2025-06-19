class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;
    public MyStack() {
        this.q1 = new LinkedList<>();
        this.q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        while(q1.size()>1){
            q2.add(q1.remove());
        }
        int popEle=q1.remove();
        Queue<Integer> temp=q1;
        q1=q2;
        q2=temp;
        return popEle;
    }
    
    public int top() {
        while(q1.size()>1){
            q2.add(q1.remove());
        }
        int top=q1.remove();
        q2.add(top);
        Queue<Integer> temp=q1;
        q1=q2;
        q2=temp;
        return top;
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
