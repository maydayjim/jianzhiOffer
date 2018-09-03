import java.util.Stack;

public class SolutionHot17 {
    //这是递归的方法
    public void Mirror(TreeNode root) {
        if(root != null ){
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            Mirror(root.left);
            Mirror(root.right);
        }
    }
    //非递归方法,用栈来模拟递归，双重循环一层层往下，再一层层往右
    public  void  Mirror2(TreeNode root ){
        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                TreeNode temp = root.left;
                root.left = root.right;
                root.right = temp;
                stack.push(root);
                root = root.left;
            }
            if (!stack.isEmpty()) {
                root = stack.pop();
                root = root.right;
            }
        }
    }
}
