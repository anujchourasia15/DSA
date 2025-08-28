// 27 aug 2025
// https://leetcode.com/problems/delete-nodes-from-linked-list-present-in-array/


class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        if(head == null) return head;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        ListNode curr = head;
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode prev = dummyNode;
        while(curr != null){
            if(set.contains(curr.val)){
                prev.next = curr.next;
            }else{
                prev=curr;
            }

            curr=curr.next;
        }
        return dummyNode.next;
    }
}