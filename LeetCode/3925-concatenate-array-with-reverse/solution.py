class Solution:
    def concatWithReverse(self, nums: list[int]) -> list[int]:
        # a = nums[::-1]
        return nums + nums[::-1]