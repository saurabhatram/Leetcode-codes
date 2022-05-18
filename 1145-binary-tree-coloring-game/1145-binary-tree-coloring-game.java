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
    static int xkaLeft=0;
    static int xkaRight=0;
    public static int size(TreeNode node,int x)
    {
        if(node==null)
        {
            return 0;
        }
        

        
     int   leftSize=size(node.left,x);
     int   rightSize=size(node.right,x);

        if(node.val==x)
        {
            xkaLeft=leftSize;
            xkaRight=rightSize;
        }
        return leftSize+rightSize+1;
        
    }
    
    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
     
        int totalNodes=size(root,x);
        
        int otherSide= totalNodes-(xkaLeft+xkaRight+1);
        
        int player2nodes= Math.max(otherSide,Math.max(xkaLeft,xkaRight));
        int player1nodes=totalNodes-player2nodes;
        if(player2nodes>player1nodes)
            return true;
        
        return false;
    }
}