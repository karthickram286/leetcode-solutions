/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        
        // Get middle of list
        ListNode mid = getMid(head);
        
        ListNode temp = new ListNode();
        
        // Reverse the second half of list
        ListNode reverse = reverseList(mid);
        
        // Merge the two lists
        while (head != mid && reverse != null) {
            temp.next = head;
            head = head.next;
            temp = temp.next;
            temp.next = reverse;
            reverse = reverse.next;
            temp = temp.next;
        }
        
        return;
    }
    
    private ListNode getMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }

    private ListNode reverseList(ListNode node) { 	
    	ListNode prev = node;
        ListNode cur = node.next;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;

            prev = cur;
            cur = next;
        }
        
        node.next = null;
        return prev;
    }
}