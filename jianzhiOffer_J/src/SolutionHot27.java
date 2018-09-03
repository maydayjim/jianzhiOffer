import java.util.ArrayList;
import java.util.Iterator;
/**
 public class TreeNode {
 int val = 0;
 TreeNode left = null;
 TreeNode right = null;

 public TreeNode(int val) {
 this.val = val;
 }
 }
 */
//没太懂啊这个
public class SolutionHot27 {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if (root == null)
            return new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> path = new ArrayList<Integer>(); // 栈，用做存储路径
        int currentSum = 0;
        FindPath(root, target, arrayList, path, currentSum);

        return arrayList;
    }
    public void FindPath(TreeNode root,int target, ArrayList<ArrayList<Integer>> arrayList, ArrayList<Integer> path, int currentSum) {
        currentSum += root.val;
        path.add(root.val);
        // 如果是叶结点，并且路径和符合条件
        boolean isLeaf = ((root.left==null) && (root.right==null));
        if (currentSum==target && isLeaf) {
            Iterator<Integer> iterator = path.iterator();
            ArrayList<Integer> pathTemp = new ArrayList<>();
            while (iterator.hasNext()) {
                pathTemp.add(iterator.next());
            }

            arrayList.add(pathTemp);
        }
        //如果不是叶结点，遍历它的子节点
        if (root.left != null)
            FindPath(root.left, target, arrayList, path, currentSum);
        if (root.right != null)
            FindPath(root.right, target, arrayList, path, currentSum);
        // 返回父节点前，在路径上删除当前节点
        path.remove(path.size()-1);
    }


}
