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
    
    static class Pair implements Comparable<Pair>
    {
        TreeNode node;
        int h;
        int v;
        
        Pair(TreeNode node, int h,int v)
        {
            this.node= node;
            this.h=h;
            this.v=v;
        }

      public int  compareTo(Pair other)
        {
            if(this.h==other.h)
            {
                return this.node.val-other.node.val;
            }                

            return this.h-other.h;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
    
        List<List<Integer>> li = new ArrayList<List<Integer>>();
        
        if(root==null)
            return li;
        
        ArrayList<Integer> al = new ArrayList<>();
        
        Queue<Pair> qu= new LinkedList<>();
    HashMap<Integer, PriorityQueue<Pair>> hm= new HashMap<>();
        
        qu.add(new Pair(root,0,0));
        
        int minLeft=0;
        int maxRight=0;
        
        while(qu.size()!=0)
        {
            
            Pair rem= qu.remove();//remove
            
            if(minLeft>rem.v)
            {
                minLeft=rem.v;
            }
            if(maxRight<rem.v)
            {
                maxRight=rem.v;
            }
                
            //work
            if(hm.containsKey(rem.v)==true)
            {
            PriorityQueue<Pair>  temp=hm.get(rem.v);
            temp.add(rem);
            }
            else
            {
                PriorityQueue<Pair> temp = new PriorityQueue<Pair>();
                temp.add(rem);
                hm.put(rem.v,temp);
            }
            
            //add children
            if(rem.node.left!=null)
            {
             qu.add(new Pair(rem.node.left,rem.h+1,rem.v-1));   
            }
            
            if(rem.node.right!=null)
            {
             qu.add(new Pair(rem.node.right,rem.h+1,rem.v+1));   
            }
            
        }
        
        for(int i=minLeft;i<=maxRight;i++)
        {
        PriorityQueue<Pair>  unsortedList= hm.get(i);
           
            
        ArrayList<Integer> sorted= new ArrayList<>();
            while(unsortedList.size()!=0)
            {   
                Pair temp= unsortedList.remove();
                sorted.add(temp.node.val);
            }
            
            li.add(sorted);
        }
        
        return li;
    }
}