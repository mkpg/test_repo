class Solution:
    def selfDividingNumbers(self, a: int, b: int) -> List[int]:
        # a = int(input())
        # b = int(input())
        j = []
        for i in range(a,b+1):
            
            if '0' in str(i):
                continue
            else:
                d = i
                cn = 0
                mn = 0
                while d!=0:
                    z=d%10
                    if i%z == 0:
                        mn+=1
                    cn+=1
                    d//=10
                if cn == mn:
                    j.append(i)
                
                
        return j