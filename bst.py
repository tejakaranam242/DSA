class Solution:
    def leafNodes(self, preorder):
        stack = []
        res = []
        result = False
        
        for i in range(len(preorder) - 1):
            p = preorder[i]
            n = preorder[i + 1]
            if n < p:
                stack.append(p)
            else:
                while stack and n > stack[-1]:
                    stack.pop()
                    result = True
            if result:
                res.append(p)
            result = False
        
        res.append(preorder[-1])
        return res
