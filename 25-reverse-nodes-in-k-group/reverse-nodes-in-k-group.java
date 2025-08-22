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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k == 1)return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevGroupEnd = dummy;
        ListNode current = head;
        while (true) {
            ListNode kth = getKthNode(current, k);
            if (kth == null) break;
            ListNode nextGroupStart = kth.next;
            ListNode prev = nextGroupStart;
            ListNode temp = current;
            while(temp != nextGroupStart){
                ListNode next = temp.next;
                temp.next = prev;
                prev = temp;
                temp = next;
            }
             ListNode tempEnd = prevGroupEnd.next;
            prevGroupEnd.next = kth;
            prevGroupEnd = tempEnd;

            current = nextGroupStart;
        }
        return dummy.next; 
    }
    private ListNode getKthNode(ListNode curr, int k) {
        while (curr != null && k > 1) {
            curr = curr.next;
            k--;
        }
        return curr;
    }
}