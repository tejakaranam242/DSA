class Solution {
    static int maxLength(String s) {
        // code here
        Stack<Integer> st = new Stack<Integer>();
        st.push(-1);
        int len=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(i);
            }
            else{
                if(!st.isEmpty())
                st.pop();
            
            if(!st.isEmpty()){
                len=Math.max(len,i-st.peek());
            }
            else{
                st.push(i);
            }
            }
        }
        return len;
        
    }
}
