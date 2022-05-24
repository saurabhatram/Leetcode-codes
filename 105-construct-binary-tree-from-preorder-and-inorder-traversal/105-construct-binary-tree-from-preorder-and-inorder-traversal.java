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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
     
        HashMap<Integer,Integer> hm= new HashMap<>();
        
        for(int i=0;i<inorder.length;i++)
        {
            hm.put(inorder[i],i);
        }
        
     return   construct(0,preorder.length-1,0,inorder.length-1,preorder,hm);
    }
    
    public TreeNode construct(int pre_lo,int pre_hi,int in_lo,int in_hi,int[] preorder,HashMap<Integer,Integer> hm)
    {
        if(pre_lo>pre_hi|| in_lo>in_hi)
            return null;
            
        TreeNode node= new TreeNode();
        
        node.val=preorder[pre_lo];
        int index=hm.get(preorder[pre_lo]);
        int lhs=index-in_lo;
        
        node.left=construct(pre_lo+1,pre_lo+lhs,in_lo,index-1,preorder,hm);
        node.right=construct(pre_lo+lhs+1,pre_hi,index+1,in_hi,preorder,hm);
        
        return node;
    }
}