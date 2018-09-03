/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class SolutionHot32 {
    //王者，没什么好说的
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1 == null || pHead2 == null){
            return null;
        }
        int length1 = 0;
        int length2 = 0;
        ListNode head1 = pHead1;
        ListNode head2 = pHead2;
        while (head1!=null){
            length1++;
            head1 = head1.next;
        }
        while (head2!=null){
            length2++;
            head2 = head2.next;
        }
        int tmp = length1-length2;
        head1 = pHead1;
        head2 = pHead2;
        if(tmp > 0){
            for (int i = 0; i <tmp ; i++) {
                head1 = head1.next;
            }
        }else {
            for (int i = 0; i < -tmp; i++) {
                head2 = head2.next;
            }
        }
        while (head1 != null && head2 != null){
            if(head1 == head2){
                break;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return head1;


    }

}
