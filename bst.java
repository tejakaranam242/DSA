class Solution {
    public ArrayList<Integer> leafNodes(int[] preorder) {
        // code here
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        boolean result = false;
        int p,n;
        for (int i=0;i<preorder.length-1;i++){
            p=preorder[i];
            n=preorder[i+1];
            if(n<p){
                stack.push(p);
            }
            else{
                while(!stack.isEmpty()&&n>stack.peek()){
                    stack.pop();
                    result=true;
                }
            }
            if(result){
                res.add(p);
            }
            result=false;
        }
        res.add(preorder[preorder.length-1]);
        return res;
    }
}
