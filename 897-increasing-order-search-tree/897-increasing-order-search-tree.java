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
TreeNode curr;
    public TreeNode increasingBST(TreeNode root) {
    TreeNode node=new TreeNode(0);
    curr=node;
    inorder(root);
        return node.right;
    }


        public void inorder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
            
        inorder(root.left);
        root.left=null;
        curr.right=root;
        curr=curr.right;
        inorder(root.right);
    }

}