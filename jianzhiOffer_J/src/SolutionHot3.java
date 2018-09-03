import java.util.ArrayList;
import java.util.Stack;

public class SolutionHot3 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> alist = new ArrayList<>();
        if(listNode == null) return  alist;
        Stack<ListNode> stack = new Stack<>();
        while (listNode != null){
            stack.push(listNode);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()){
            alist.add(stack.pop().val);
        }
        return alist;

    }
}