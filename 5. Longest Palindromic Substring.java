class Solution {
    public Boolean isPali(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right))
            return false;
            left++;
            right--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        String max="";
        if(s.length()==1)
        return s;
        for(int i=0;i<s.length();i++){
            String s1="";
            for(int j=i;j<s.length();j++){
                s1=s.substring(i,j+1);
                if(isPali(s1)&&(s1.length()>max.length())){
                    max=s1;
                }
            }
        }
        return max;
    }
}
