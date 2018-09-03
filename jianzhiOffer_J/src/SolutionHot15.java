public class SolutionHot15 {

  class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
    public ListNode ReverseList(ListNode head) {
      if(head == null){
          return  null;
      }
        ListNode newHead = head;
        ListNode oldHead = newHead.next;
        newHead.next = null;
        while (oldHead != null){
            ListNode temp = oldHead.next;
            oldHead.next = newHead;
            newHead = oldHead;
            oldHead = temp;
        }
        return newHead;
    }
}
