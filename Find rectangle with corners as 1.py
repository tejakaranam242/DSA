class Solution:    
    def ValidCorner(self,mat): 
        # Code here 
        c = 0
        if len(mat) > 1 and len(mat[0]) > 1:
            for i in range(len(mat)):
                for j in range(len(mat[0])):
                    if mat[i][j] == 1:
                        for k in range(j + 1, len(mat[0])):
                            if mat[i][k] == 1:
                                for s in range(i + 1, len(mat)):
                                    if mat[s][k] == 1 and mat[s][j] == 1:
                                        return True
        return False
