/* Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes 
of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4

*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode p = head;
        
        ListNode p1 = l1;
        ListNode p2 = l2;
        
        //This will handle if l1 or l2 are null
        if (p1 == null && p2 != null) {
            return p2;
        } else if (p1 != null && p2 == null) {
            return p1;
        } else if (p1 == null && p2 == null) {
            return p1;
        }
        
        //where everything happens
        while (p1 != null && p2 != null) {
            if (p1.val <= p2.val) {   //compares values
                p.next = p1;          //sets the node after head to l1
                p1 = p1.next;         //updates p1 to the next node
                p = p.next;           //updates the head 
            } else {
                p.next = p2;
                p2 = p2.next;
                p = p.next;
            }       
            
            if (p1 == null) {        // checkas if p1 or p2 are null
                p.next = p2;
            }
        
            if (p2 == null) {
                p.next = p1;
            }
        
        }
    
        return head.next;
    }
}
