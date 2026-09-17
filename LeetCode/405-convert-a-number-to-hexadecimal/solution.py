class Solution:
    def toHex(self, num: int) -> str:
        st = ""
        if num == 0:
            return "0"

        if num < 0:
            num = num + 2**32

        while num>0:
            r = num%16
            
            if r >= 10:
                st+=chr(65+(r-10))
            # elif 48<=r<=57:
            else:
                st+=chr(48 + r)
            num//=16
        return st[::-1].lower()