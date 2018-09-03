public class SolutionHot18 {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if( root2 == null || root1 == null) return  false;
        if(equal(root1,root2)) {
               return  true;
        }

        if(HasSubtree(root1.left,root2)){
            return  true;
        }
        if(HasSubtree(root1.right,root2)){
            return  true;
        }
        return  false;

    }
    //这一段比较考验鲁棒性
    private boolean equal(TreeNode root1 ,TreeNode root2){
        if(root2 == null){
            return true;
        }
        if (root1 == null){
            return  false;
        }
        if(root1.val != root2.val){
            return  false;
        }
        return  equal(root1.left,root2.left)&&equal(root1.right,root2.right);

    }
}
