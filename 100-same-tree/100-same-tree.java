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
    public boolean isSameTree(TreeNode p, TreeNode q) {
     
        if ((p==null && q==null))
        {
            return true;
        }


      boolean left=false,right=false;
        
        if(p!=null&&q!=null)
        {      
       left= isSameTree(p.left,q.left) ;
        
       right=  isSameTree(p.right,q.right);
        }
        
        if(left==true&&right==true && p.val==q.val)
            return true;
        
        return false;
    }
}