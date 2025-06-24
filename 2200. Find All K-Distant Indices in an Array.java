class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        ArrayList<Integer> Indexs = new ArrayList<>();
        int Size = nums.length;
        for(int i=0;i<Size;i++){
            if(nums[i]==key){
                Indexs.add(i);
            }
        }
        ArrayList<Integer> Result = new ArrayList<>();
        for(int i=0;i<Size;i++){
            int flag=0;
            for(int j:Indexs){
                if(Math.abs(i-j)<=k){
                    flag=1;
                    break;
                }
            }
            if(flag==1){
                Result.add(i);
            }
        }
        return Result;
    }
}
