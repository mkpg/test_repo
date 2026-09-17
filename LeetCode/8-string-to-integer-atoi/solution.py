class Solution:
    def myAtoi(self, s: str) -> int:
        s = s.lstrip(' ')
        minn = -2**31
        maxx = 2**31-1
        no = 0
        d = []
        s = list(s)

        if not s:
            return 0

        if s[0] == '-':
            d.append('-')
            s.pop(0)
        elif s[0] == '+':
            d.append('+')
            s.pop(0)
        
        if not s:
            if d == ['-'] or d == ['+']:
                return 0
            return 0

        if s[0] == '0' and 1 != len(s) and s[1].isdigit():
            s.pop(0)

        for i in range(0, len(s)):
            if s[i].isdigit():
                d.append(s[i])
            else:
                break

        if not d or d == ['-'] or d == ['+']:
            return 0
            
        z = "".join(d)
        num = int(z)
        
        if num < minn:
            return minn
        elif num > maxx:
            return maxx
        
        return num