/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode pointer = head;
        
        while (pointer != null) {
            ListNode next = pointer.next;
            pointer.next = prev;
            prev = pointer;
            pointer = next;
        }
        
        return prev;
    }
}