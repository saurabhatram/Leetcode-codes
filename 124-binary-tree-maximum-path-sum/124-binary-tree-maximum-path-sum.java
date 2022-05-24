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
    
    static int maxPathSum=Integer.MIN_VALUE;

     public int maxPathSum(TreeNode root) 
     {
         maxPathSum=Integer.MIN_VALUE;      
         int MaxOnePath=helper(root);
         return maxPathSum;
     }
         public int helper(TreeNode root)
    {
        if(root==null)
            return 0;

         int   maxLeftSum=helper(root.left);
                maxLeftSum=maxLeftSum>0?maxLeftSum:0;
             
         int   maxRightSum=helper(root.right);
                        maxRightSum=maxRightSum>0?maxRightSum:0;
        int Mypath=maxLeftSum+root.val+maxRightSum;
        
        maxPathSum= Math.max(Mypath,maxPathSum);
        
        int MaxOnePath=Math.max(maxLeftSum,maxRightSum);
        MaxOnePath= (MaxOnePath+root.val);
        
        return MaxOnePath;
    }
}