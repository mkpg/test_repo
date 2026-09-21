class Solution:
    def convertToBase7(self, num: int) -> str:
        if num == 0:
            return "0"
        
        is_negative = num < 0
        num = abs(num)
        
        st = ""
        while num > 0:
            r = num % 7
            st += chr(48 + r)
            num //= 7
            

        result = st[::-1]
        
        if is_negative:
            return "-" + result
            
        return result
