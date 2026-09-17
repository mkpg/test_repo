/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;

            return a( root.left, root.right);

    }
    private boolean a(TreeNode l1 , TreeNode l2 ){
        if(l1 == null && l2 == null) return true;
        if(l1 == null || l2 == null) return false;
        if(l1.val != l2.val) return false;
    

        // if(root==null) return true;
        // if(root.left!=null && root.right != null) return true;
        // if(root.left!=null || root.right != null) return false;
        // if(root.left.val == root.right.val) return true;
        // if(root.right.val == root.left.val) return true;
        // if(root.left.val != root.right.val) return false;
        // if(root.right.val != root.left.val) return false;
        return a(l1.left,l2.right) && a(l1.right,l2.left);
         
    }  
}