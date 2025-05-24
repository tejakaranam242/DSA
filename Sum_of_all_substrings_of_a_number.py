class Solution:
    def sumSubstrings(self,s):
        # code here
        sum=0
        n = len(s);
        for i in range(n):
            sub=""
            for j in range(i,n):
                sub+=s[j]
                sum+=int(sub)
        return sum
