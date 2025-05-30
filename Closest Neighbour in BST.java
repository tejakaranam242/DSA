class Solution {
    //ArrayList<Integer> res = new ArrayList<Integer>();
    int max=-1;
    public void min(Node root,int t){
        if(root==null)
        return;
         min(root.left,t);
        if(root.data<=t){
            if(root.data>max)
            max=root.data;
            min(root.right,t);
        }
        
    }
    public int findMaxFork(Node root, int k) {
        // code here.
        min(root,k);
        return max;
    }
}
