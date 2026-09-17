class Solution:
    def reverseWords(self, s: str) -> str:
        st = s.split(' ')

        for i in range(len(st)):
            w = st[i]
            st[i] = w[::-1]

        return ' '.join(st)
