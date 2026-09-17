class Solution:
    def findMaxAverage(self, arr: List[int], k: int) -> float:
        w = sum(arr[:k])
        m = w

        for i in range(k,len(arr)):
            r = arr[i-k]
            e = arr[i]
            w = w - r
            w = w + e
            m = max(m,w)
        return m/k
