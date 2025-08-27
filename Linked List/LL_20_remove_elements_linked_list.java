class LL_20_remove_elements_linked_list {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        dummy.next=head;
        ListNode curr = head, prev = dummy;
        while(curr != null){
            if(curr.val == val){
                prev.next=curr.next;
            }else{
                prev = curr;
            }
            curr=curr.next;
        }
        return dummy.next;
    }
}