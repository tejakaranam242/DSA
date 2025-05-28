class Solution {
    public boolean ValidCorner(int mat[][]) {
        // Code here
        int c=0;
        if(mat[0].length>1&&mat.length>1)
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    for(int k=j+1;k<mat[0].length;k++){
                        if(mat[i][k]==1){
                            for(int s=i+1;s<mat.length;s++){
                                if(mat[s][k]==1&&mat[s][j]==1)
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
