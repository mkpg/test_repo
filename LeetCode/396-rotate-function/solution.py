class Solution:
    def maxRotateFunction(self, nums: List[int]) -> int:
        n = len(nums)
        t = sum(nums)
        
        c = sum(i * val for i, val in enumerate(nums))
        m = c
        
        for i in range(n - 1, 0, -1):
            c = c + t - n * nums[i]
            m = max(m, c)
            
        return m