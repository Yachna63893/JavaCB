package Tree;

public class Path_Sum {
     public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
        }
    }
    class Solution{
        public boolean hasPath(TreeNode root, int targetSum){
            if(root == null){
                return false;
            }
            if(root.left==null && root.right==null){
                return targetSum-root.val==0;
            }
            boolean left = hasPath(root.left, targetSum-root.val);
            boolean right = hasPath(root.right, targetSum-root.val);
            return left||right;
        }
    }
}
