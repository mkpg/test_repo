class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        if len(nums) == 0 or k==0:
            return 
        k = k % len(nums)
        
        d = []
        for i in range(k):
            d.append(nums.pop())
            
        d = d[::-1]
        
        nums[:] = d+nums
        # print(nums)
        # return nums
        