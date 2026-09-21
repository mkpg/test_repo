# class Solution:
#     def firstUniqueEven(self, nums: list[int]) -> int:
#         i = 0
#         j = i+1
#         if len(set(nums)) == 1 and len(nums) > 1:
#             return -1
#         while i < len(nums):
#             if nums[i] %2!=0:
#                 i+=1
#                 j=i+1
#             else:
#                 while j < len(nums):
#                     if nums[i] == nums[j]:
#                         i+=1
#                         j = i+1
#                     else:
#                         j+=1
#                         return nums[i]
class Solution:
    def firstUniqueEven(self, nums: list[int]) -> int:
        i = 0

        while i < len(nums):
            if nums[i] % 2 != 0:
                i += 1
                continue

            j = 0
            unique = True

            while j < len(nums):
                if i != j and nums[i] == nums[j]:
                    unique = False
                    break
                j += 1

            if unique:
                return nums[i]

            i += 1

        return -1
        # using 2 pointer where first check if the nums[i] is even then doing nested while insite the condition then insite the while giving the condition for repeated looping so O(n^2);
            