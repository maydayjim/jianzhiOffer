public class SolutionHot33 {
    //可以说是小小王者了
    public RandomListNode Clone(RandomListNode pHead) {
        if(pHead == null){
            return  null;
        }
        RandomListNode ornHead = pHead;
        int count = 0;
        while (ornHead!=null){
            count++;
            ornHead = ornHead.next;
        }
        ornHead = pHead;
        RandomListNode head = new RandomListNode(pHead.label);
        RandomListNode rail = head;
        //建立链表
        for (int i = 1; i < count; i++) {
            ornHead = ornHead.next;
            RandomListNode temHead = new RandomListNode(ornHead.label);
            rail.next = temHead;
            rail = rail.next;
        }
        //开始搞random指针
        RandomListNode Random1 = pHead;
        RandomListNode Random2 = head;
        for (int i = 0; i < count; i++) {
            RandomListNode find1 = pHead;
            RandomListNode find2 = head;
            for (int j = 0; j < count; j++) {
                if(find1.random == Random1){
                    find2.random = Random2;
                }
                find1 = find1.next;
                find2 = find2.next;
            }
            Random1 = Random1.next;
            Random2 = Random2.next;
        }
        return head;
    }
}
