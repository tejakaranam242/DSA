class Solution {
    int maxl=0,maxs=0;
    public void maxSum(Node root,int sum,int level){
        if(root==null){
            return;
        }
        sum+=root.data;
        level++;
        maxSum(root.left,sum,level);
        maxSum(root.right,sum,level);
        if(level>maxl){
            maxs=sum;
            maxl=level;
        }
        else if(level==maxl){
            maxs=Math.max(maxs,sum);
        }
    }
    public int sumOfLongRootToLeafPath(Node root) {
        // code here
        maxSum(root,0,0);
        return maxs;
    }
}
