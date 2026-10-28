class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int val1;
            int val2;

            if (l1 != null) {
                val1 = l1.val;
            } else {
                val1 = 0;
            }

            if (l2 != null) {
                val2 = l2.val;
            } else {
                val2 = 0;
            }

            int sum = val1 + val2 + carry;
            carry = sum / 10;

            current.next = new ListNode(sum % 10);
            current = current.next;

            // Move to next l1
            if (l1 != null) {
                l1 = l1.next;
            } else {
                l1 = null;
            }

            // Move to next l2
            if (l2 != null) {
                l2 = l2.next;
            } else {
                l2 = null;
            }
        }

        // Handle final carry
        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        return dummyHead.next;
    }
}
