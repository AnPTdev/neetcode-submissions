class MyStack {
    Queue<Integer> queue1 = new ArrayDeque<>();
    Queue<Integer> queue2 = new ArrayDeque<>();
    int lastedVal;
    public MyStack() {
        this.queue1 = new ArrayDeque<>();
        this.queue2 = new ArrayDeque<>();
    }

    public void push(int x) {
        queue1.offer(x);
        lastedVal = x;
    }

    public int pop() {
       while(queue1.size() > 1){
            int val = queue1.poll();
            lastedVal = val;
            queue2.offer(val);
       }
       int result = queue1.poll();
       Queue<Integer> temp = queue1;
       queue1 = queue2;
       queue2 = temp;
       return result;
    }

    public int top() {
        return lastedVal;
    }

    public boolean empty() {
       return queue1.isEmpty();
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