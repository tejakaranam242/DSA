class Solution:
    def maxWater(self, arr):
        # code here
        left=[]
        right=[]
        max1=arr[0]
        for i in arr:
            if i > max1:
                max1=i
            left.append(max1)
        max1=arr[-1]
        for i in range(len(arr)-1,-1,-1):
            if arr[i] > max1:
                max1 = arr[i]
            right.append(max1)
        right.reverse()
        sum=0
        for i in range(0,len(arr)):
            sum+=min(left[i],right[i])-arr[i]
        return sum
