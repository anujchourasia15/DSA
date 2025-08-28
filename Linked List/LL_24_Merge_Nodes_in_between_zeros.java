//27 aug 2025
//https://leetcode.com/problems/merge-nodes-in-between-zeros/

class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode curr = head;
        curr=curr.next;
        ListNode dummyNode = new ListNode(-1);
        ListNode dummy = dummyNode;
        int sum = 0;
        while(curr != null){
            if(curr.val == 0){
                dummy.next = new ListNode(sum);
                dummy=dummy.next;
                sum = 0;
            }else{
                sum += curr.val;
            }
            curr=curr.next;
        }   
        return dummyNode.next;
    }
}