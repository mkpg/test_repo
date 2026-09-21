class Solution:
    def convertToTitle(self, a: int) -> str:
        d = ''

        while a>0:
            a=a-1
            r = a%26
            d += chr(65 + r)
            a//=26
        return(d[::-1])