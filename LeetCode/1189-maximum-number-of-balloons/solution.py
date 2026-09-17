class Solution:
    def maxNumberOfBalloons(self, t): 
        a = ['b','a','l','l','o','o','n']
        b = ['b','a','l','l','o','o','n']
        i = 0
        c = 0
        t = list(t)
        while i < len(t):

            if t[i] in a:
                a.remove(t[i])
                t.pop(i)      
            else:
                i += 1
            if len(a) == 0:
                c +=1
                a += b
                i = 0

        print(c)
        return c
                #     if j in a:
                #         # print(j)
                #         t.pop(i)
