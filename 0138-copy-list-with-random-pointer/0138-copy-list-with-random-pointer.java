/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        
        Node newHead = null, newCurr = null;
        Node curr = head;
        
        if (head == null)
            return newHead;
        
        // Insert new list in the middle of original
        while (curr != null) {
            Node newNode = new Node(curr.val);
            newNode.next = curr.next;
            curr.next = newNode;    
            curr = curr.next.next;
        }
        
        // Point the random pointers for the new List
        curr = head;
        while (curr != null) {
            if (curr.random != null)
                curr.next.random = curr.random.next;
            curr = curr.next.next;
        }
        
        // Remove the new list from the original list
        newHead = head.next;
        newCurr = newHead;
        curr = head;
        while (curr.next != null && curr.next.next != null) {
            curr.next = curr.next.next;
            newCurr.next = newCurr.next.next;
            curr = curr.next;
            newCurr = newCurr.next;
        }
        
        // Pointing the last nodes from both lists to null
        curr.next = null;
        newCurr.next = null;
        
        return newHead;
    }
}