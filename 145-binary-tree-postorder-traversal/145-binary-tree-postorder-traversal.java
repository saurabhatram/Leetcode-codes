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
    
    public static class Pair
    {
        TreeNode root;
        int status;
        
        Pair(){};
        //1 means left present, 2 right, 3 dono ho gaye
        Pair (TreeNode root, int status)
        {
            this.root=root;
            this.status=status;
        }
    }
    public List<Integer> postorderTraversal(TreeNode root) {
    
    
        
    Stack<Pair> st= new Stack<>();
    List<Integer> base= new ArrayList<>();
    
        if(root==null)
        return base;
    
    st.push(new Pair(root,0));
        
    while(st.size()!=0)
    {
        Pair top=st.peek();

        if(top.root==null)
        {
            System.out.print(st.peek().root.val+"-culprit");
            st.pop();
                    
        }
        
       else if(top.root.left!=null && top.status<1)
        {   top.status=1;
            st.push(new Pair(top.root.left,0));
                 System.out.print(top.root.val+" ");
            
        }
        else if(top.root.right!=null && top.status<2)
        {
            top.status=2;
            st.push(new Pair(top.root.right,0));
            System.out.print(top.root.val+" ");
        }
        else
        {        
        Pair ans= st.pop();
        base.add(ans.root.val);
        System.out.print(top.root.val+" ");
        }
        

    
    }
    
    return base;
    }
}