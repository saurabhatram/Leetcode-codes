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
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        return inorder(root,low,high);
    }
    
    public static int inorder(TreeNode root,int low,int high)
    {
        
        if(root==null)
        {
            return 0;
        }
        
        
        int leftSum= inorder(root.left,low,high);
        int rightSum=inorder(root.right,low,high);
        
        if(low<=root.val && high>=root.val)
        {
            return root.val+leftSum+rightSum;
        }
        
        return leftSum+rightSum;
    }
}