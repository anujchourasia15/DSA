//27 aug 2025
//Link:https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/?envType=problem-list-v2&envId=linked-list

class Solution {
    public int getDecimalValue(ListNode head) {
        int res = 0;
        ListNode curr = head;
        while(curr!=null){
            res = (res << 1) + curr.val;
            curr=curr.next;
        }
        return res;
    }
}