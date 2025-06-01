class Solution {
    int countPairs(int[][] mat1, int[][] mat2, int x) {
        // code here
        int c=0;
        Set<Integer> res = new HashSet<Integer>();
        for(int i=0;i<mat2.length;i++){
            for(int j=0;j<mat2[0].length;j++){
                res.add(mat1[i][j]);
            }
        }
        for(int i=0;i<mat2.length;i++){
            for(int j=0;j<mat2[0].length;j++){
                if(res.contains(x-mat2[i][j]))
                c++;
            }
        }
        return c;
    }
}
