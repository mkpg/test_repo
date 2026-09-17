import re
class Solution:
    def isPalindrome(self, s: str) -> bool:
        s = re.sub(r"[^0-9a-zA-Z]","",s).lower()

        a = 0
        l = len(s)-1
        while a<l:
            if s[a]==s[l]:
                a+=1
                l-=1
            else:
                return False
        return True