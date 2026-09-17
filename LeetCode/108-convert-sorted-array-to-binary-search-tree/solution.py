# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def sortedArrayToBST(self, nums):
        if len(nums) == 0:
            return None
        mid = len(nums)//2
        rt = TreeNode(nums[mid])
        rt.left = self.sortedArrayToBST(nums[:mid])
        rt.right = self.sortedArrayToBST(nums[mid+1:])
        return rt
        