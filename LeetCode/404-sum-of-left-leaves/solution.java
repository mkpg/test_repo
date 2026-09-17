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
    int c = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null){
            return c;
        }if(root.left!=null && root.left.left == null && root.left.right == null){
        c = c + root.left.val;}
        
        sumOfLeftLeaves(root.left);
        sumOfLeftLeaves(root.right);
        return c;
    }
}