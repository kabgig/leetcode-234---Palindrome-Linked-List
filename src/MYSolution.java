import java.util.ArrayDeque;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class MYSolution {
    public boolean isPalindrome(ListNode head) {
        ArrayDeque<Integer> deque1 = new ArrayDeque<>(), deque2 = new ArrayDeque<>();

        while (head != null) {
            deque1.addFirst(head.val);
            deque2.addLast(head.val);
            head = head.next;
        }
        boolean result = false;
        while (!deque1.isEmpty() && !deque2.isEmpty()) {
            if (deque1.pop() != deque2.pop()) {result = false; break;}
            else result = true;
        }
        return result;
    }
}