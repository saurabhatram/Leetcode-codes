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
    public List<Integer> preorderTraversal(TreeNode root) {
        
    if(root==null)
    {
        List<Integer> base= new ArrayList<>();
        return base;
    }
    
    
    List<Integer> base= new ArrayList<>();
    preorder(root,base);
    return base;    
    }
    
public void preorder(TreeNode root, List<Integer> base)
    {
        if(root==null)
        {
            return;
        }

        base.add(root.val);
        preorder(root.left,base);
        preorder(root.right,base);
            
    }
}