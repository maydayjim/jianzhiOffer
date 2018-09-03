import java.util.Stack;

public class SolutionHot11 {
     class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode FindKthToTail(ListNode head,int k) {
        if (head == null || k <= 0) {
            return null;
        }
         ListNode fast = head;
         ListNode slow = head;
         int i = 1;
         while (i<k){
             if (fast.next!=null){
                 fast = fast.next;
             }else {
                 return null ;
             }

             i++;
         }
         while (fast.next!=null){
             fast =  fast.next;
             slow = slow.next;
         }
         return  slow;
    }
}
