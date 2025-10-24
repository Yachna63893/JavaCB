package Tree;

public class Construct_BT_Pre_In_Trav {
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
    class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return Create(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1);
    }
    public TreeNode Create(int[] pre,int plo, int phi, int[] inor, int ilo, int ihi){
        if(ilo>ihi || plo>phi){
            return null;
        }
        TreeNode node = new TreeNode(pre[plo]);
        int idx = Search(inor, ilo, ihi, pre[plo]);
        int ne = idx-ilo;
        node.left = Create(pre, plo+1, plo+ne, inor, ilo, idx-1);
        node.right = Create(pre, plo+ne+1, phi, inor, idx+1, ihi);

        return node;
    }
    public int Search(int[] inor, int si, int ei, int item){
        for(int i=si; i<=ei; i++){
            if(inor[i]==item){
                return i;
            }
        }
        return 0;
    }
}
}
