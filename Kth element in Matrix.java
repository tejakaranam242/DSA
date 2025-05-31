class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        // code here
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                res.add(matrix[i][j]);
            }
        }
        Collections.sort(res);
        return res.get(k-1);
    }
}
