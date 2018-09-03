public class SolutionHot28 {
    public int TreeDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left == null&&root.right == null){
            return  1;
        }
        if(root.left != null && root.right == null){
            return TreeDepth(root.left)+1;
        }
        if(root.left == null&&root.right !=null){
            return TreeDepth(root.right)+1;
        }
        if(TreeDepth(root.right)>TreeDepth(root.left)){
            return TreeDepth(root.right)+1;
        }else {
            return TreeDepth(root.left)+1;
        }

    }
}
