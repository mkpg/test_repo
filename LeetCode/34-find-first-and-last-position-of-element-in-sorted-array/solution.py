class Solution:
    def searchRange(self, nums: List[int], t: int) -> List[int]:
        la,fi = -1,-1
        l,r = 0,len(nums)-1

        while l<=r:
            m = (l+r)//2
            if nums[m] == t:
                fi = m
                r = m-1
            elif nums[m] < t:
                l = m+1
            else:
                r = m-1

        l,r = 0,len(nums)-1

        while l<=r:
            m = (l+r)//2
            if nums[m] == t:
                la = m
                l = m+1
            elif nums[m] < t:
                l = m+1
            else:
                r = m-1

        return [fi,la]