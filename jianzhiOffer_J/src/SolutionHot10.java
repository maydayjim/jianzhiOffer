import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SolutionHot10 {
//    class TreeNode {
//        int val;
//        TreeNode left;
//        TreeNode right;
//        TreeNode(int x){val = x;}
//    }
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre == null || in == null) return  null;
        int length = pre.length;
        int length2 = in.length;
        if (length != length2) return  null;
        if (length == 0|| length2 == 0) return null;
        TreeNode headNode = new TreeNode(pre[0]);
        int position = 0;
        for (int i = 0; i <in.length ; i++) {
            if(in[i]==pre[0]){
                position = i;
                break;
            }
        }
        int leftpre[] = Arrays.copyOfRange(pre,1,position+1);
        int leftin[] = Arrays.copyOfRange(in,0,position);
        int rightpre[] = Arrays.copyOfRange(pre,position+1,length);
        int rightin[] = Arrays.copyOfRange(in,position+1,length);
        headNode.left = reConstructBinaryTree(leftpre,leftin);
        headNode.right = reConstructBinaryTree(rightpre,rightin);
        return  headNode;

    }
}
