class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < students.length; i++) {
            queue.offer(students[i]);
        }
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = sandwiches.length - 1;  i >= 0; i --) {
            stack.push(sandwiches[i]);
        }
        int n = students.length;
        int m = 0;
        while(!stack.isEmpty() && m != n){
            if(stack.peek() == queue.peek()){
                stack.pop();
                queue.poll();
                n--;
                m = 0;
            } else {
                int temp = queue.poll();
                queue.offer(temp);
                m++;
            }
        }
        return n;

    }
}