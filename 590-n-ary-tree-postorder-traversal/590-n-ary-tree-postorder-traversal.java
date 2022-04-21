/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {

        public List<Integer> postorder(Node root) {
     
        if(root==null)
        {
        List<Integer> mt= new ArrayList<>();
            return mt;
        }
        
        List<Integer> al= new ArrayList<>();
        
        for(Node child:root.children)
        {
           List<Integer> temp= postorder(child);
            al.addAll(temp);
        }
        al.add(root.val);
        return al;
        
    }
}