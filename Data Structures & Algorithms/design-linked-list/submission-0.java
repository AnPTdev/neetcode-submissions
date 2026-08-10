class ListNode {
    int val;
    ListNode next;
    ListNode prev;
    ListNode(int val) {
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}

public class MyLinkedList {
    ListNode head;
    ListNode tail;

    MyLinkedList() {
        head = new ListNode(0);
        tail = new ListNode(0);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int index) {
        ListNode curr = head.next;
        while (curr != null && index > 0) {
            curr = curr.next;
            index--;
        }
        if (curr != null && curr != tail && index == 0) {
            return curr.val;
        }
        return -1;
    }

    public void addAtHead(int val) {
        ListNode node = new ListNode(val);
        ListNode next = head.next;
        head.next = node;
        next.prev = node;
        node.prev = head;
        node.next = next;
    }

    public void addAtTail(int val) {
        ListNode node = new ListNode(val);
        ListNode prev = tail.prev;
        
        // tail.prev.next = node;
        prev.next = node;
        tail.prev = node;
        // node.prev = tail.prev;
        node.next = tail;
        node.prev = prev;
    }

    public void addAtIndex(int index, int val) {
        ListNode curr = head.next;
        while (curr != null && index > 0) {
            curr = curr.next;
            index--;
        }
        if (curr != null && index == 0) {
            ListNode node = new ListNode(val);
            ListNode prev = curr.prev;
            curr.prev = node;
            prev.next = node;
            node.next = curr;
            node.prev = prev;
        }
    }

    public void deleteAtIndex(int index) {
        ListNode curr = head.next;
        while (curr != null && index > 0) {
            curr = curr.next;
            index--;
        }
        if (curr != null && curr != tail && index == 0) {
            ListNode next = curr.next;
            ListNode prev = curr.prev;
            prev.next = next;
            next.prev = prev;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */