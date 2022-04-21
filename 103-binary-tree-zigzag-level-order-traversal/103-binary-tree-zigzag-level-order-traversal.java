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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
     
        List<List<Integer>> al = new ArrayList<List<Integer>>();
        
        if(root==null)
            return al;
        
        Queue<TreeNode> qu = new LinkedList<>();
        
        qu.add(root);
        
        int zigzag=1;
        while(qu.size()!=0)
        {
            int size=qu.size();
            
            if(zigzag%2==0)
            {   
                List<Integer> li= new ArrayList<>();
                while(size-->0)
                {
                    TreeNode front = qu.remove();


                    if(front.left!=null)
                        qu.add(front.left);
                    if(front.right!=null)
                        qu.add(front.right);

                    li.add(front.val);
                }
                Collections.reverse(li);
                al.add(li);
            }
            else
            {
                List<Integer> li= new ArrayList<>();
                while(size-->0)
                {
                    TreeNode front = qu.remove();


                    if(front.left!=null)
                        qu.add(front.left);
                    if(front.right!=null)
                        qu.add(front.right);

                    li.add(front.val);
                }
                al.add(li);
            }
            zigzag++;
            
        }
        
        return al;
    }
}