class Solution(object):
    def findWordsContaining(self, words, x):
        """
        :type words: List[str]
        :type x: str
        :rtype: List[int]
        """
        res=[]
        i=0
        for word in words:
            if x in word:
                res.append(i)
            i=i+1
        return res
        
