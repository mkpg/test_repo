class Solution(object):
    def lengthOfLongestSubstring(self, s):
        a = set()
        l = 0
        re = 0
        for i in range(len(s)):
            while s[i] in a:
                a.remove(s[l])
                l+=1
            a.add(s[i])
            re = max(re,i-l+1)
        return re

