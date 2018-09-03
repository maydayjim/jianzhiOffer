import java.util.*;
//这个导入包也很重要

public class SolutionHot19 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node.left!= null) queue.addLast(node.left);
            if(node.right!= null) queue.addLast(node.right);
            list.add(node.val);
        }
        return list;
    }
}
