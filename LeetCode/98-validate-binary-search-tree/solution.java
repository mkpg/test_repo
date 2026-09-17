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
    public boolean isValidBST(TreeNode root) {
        List<Integer> inordlist = new ArrayList<>();
        inOrder(root,inordlist);
        for(int i = 1;i<inordlist.size();i++){
            if(inordlist.get(i)<= inordlist.get(i-1)){
                return false;
            }
        }
        return true;
    }
    private void inOrder(TreeNode Node,List<Integer> list){
        if(Node ==null) return;
        inOrder(Node.left,list);
        list.add(Node.val);
        inOrder(Node.right,list);
    }
}

// class Solution {
//     public boolean isValidBST(TreeNode root) {
//         if(root==null)return false;
//         isValidBST(root.left);
//         isValidBST(root.right); 
//         if(root.left==null && root.right==null) return true;
//         if(root.left!=null && root.right!=null){
//             if(root.left.val<root.val && root.right.val>root.val) return true;
//             else return false;
//             }
       
//         return false;
//     }
// }