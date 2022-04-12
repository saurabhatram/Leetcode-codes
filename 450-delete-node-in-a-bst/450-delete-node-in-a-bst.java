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
    public int max(TreeNode root)
    {
        TreeNode temp=root;
        while(temp.right!=null)
        {
            temp=temp.right;
        }
        return temp.val;
    }
    
    public TreeNode deleteNode(TreeNode root, int key) {
        
        if(root==null)
        {
            return null;
        }
        
        if(key<root.val)
        {
            root.left= deleteNode(root.left,key);
        }
        else if(key>root.val)
        {
            root.right= deleteNode(root.right,key);
        }
        else
        {
        //case 0,1 leaf and 1 child
            
            if(root.left==null||root.right==null)
            {
                return root.left!=null?root.left:root.right;
            }
            
                int maxEle= max(root.left);
                root.val=maxEle;
                root.left=deleteNode(root.left,maxEle);
                
            
        }
        return root;
    }
}