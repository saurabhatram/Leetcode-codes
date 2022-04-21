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
    public List<List<Integer>> levelOrder(TreeNode root) {

        
        Queue<TreeNode> qu= new LinkedList<>();
        List<List<Integer>> al = new ArrayList<List<Integer>>();
        
     
        if(root==null)
            return al;
        
        
        qu.add(root);
        
        while(qu.size()!=0)
        {
            int sizee=qu.size();
            
            List<Integer> temp=new ArrayList<>();
            while(sizee-->0)
            {
            TreeNode front= qu.remove();
            
                if(front.left!=null)
                qu.add(front.left);
                if(front.right!=null)
                qu.add(front.right);
               
                temp.add(front.val);
            }
             al.add(temp);
        }
        
        return al;
    }
}