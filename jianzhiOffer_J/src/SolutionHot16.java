public class SolutionHot16 {
    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode Merge(ListNode list1,ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode newHead = null;
        if (list1.val <= list2.val) {
            newHead = list1;
            newHead.next = Merge(list1.next,list2);
        }else {
            newHead = list2;
            newHead.next = Merge(list1,list2.next);
        }

        return newHead;

    }
//        ListNode list3  = null;
//        ListNode list3Tail = null;
//        if(list1.val< list2.val) {list3 = list1;list1 = list1.next;}
//        else {list3 = list2;list2 = list2.next;}
//        list3Tail = list3;
//        while(list1 != null || list2 != null){
//            if(list1.val< list2.val){
//                list3Tail.next = list1;
//                list3Tail = list3Tail.next;
//                list1 = list1.next;
//                list3Tail.next = null;
//            }else{
//                list3Tail.next = list2;
//                list3Tail = list3Tail.next;
//                list2 = list2.next;
//                list3Tail.next = null;
//            }
//        }
//        if(list1 != null){
//            list3Tail.next = list1;
//        }
//        if(list2 != null){
//            list3Tail.next = list2;
//        }
//        return  list3;
}
