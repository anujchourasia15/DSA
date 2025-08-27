/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LL_21_intersection_of_two_list {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1 = listLen(headA);
        int len2 = listLen(headB);
        int diff = 0;
        if(len1 < len2){
            diff = len2-len1;
            return intersection(diff, headB, headA);
        }else {
            diff = len1-len2;
            return intersection(diff, headA, headB);
        }    
    }

    public ListNode intersection(int diff, ListNode head1, ListNode head2){
        ListNode curr1 = head1, curr2 = head2;
        for(int i = 0; i < diff; i++){
            if(curr1 == null) return null;
            curr1=curr1.next;
        }
        while(curr1 != null && curr2 != null){
            if(curr1 == curr2) return curr1;
            curr1=curr1.next;
            curr2=curr2.next;
        }
        return null;
    }

    public int listLen(ListNode head){
        int len = 0;
        ListNode curr = head;
        while(curr != null){
            len++;
            curr=curr.next;
        }
        return len;
    }
}